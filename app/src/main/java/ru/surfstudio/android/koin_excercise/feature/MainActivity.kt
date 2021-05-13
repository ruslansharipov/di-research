package ru.surfstudio.android.koin_excercise.feature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import ru.surfstudio.android.koin_excercise.R

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModelWithArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.doSomething()
    }
}

inline fun <reified T : ViewModel> AppCompatActivity.viewModelWithArgs(): Lazy<T> {
    return viewModel { parametersOf(intent ?: Intent()) }
}

inline fun <reified T : ViewModel> Fragment.viewModelWithArgs(): Lazy<T> {
    return viewModel { parametersOf(arguments ?: Bundle.EMPTY) }
}