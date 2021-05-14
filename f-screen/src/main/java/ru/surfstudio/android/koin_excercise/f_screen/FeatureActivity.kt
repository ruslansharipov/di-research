package ru.surfstudio.android.koin_excercise.f_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.stateViewModel

class FeatureActivity : AppCompatActivity() {

    private val viewModel: FeatureViewModel by stateViewModel(state = {
        intent.extras ?: Bundle.EMPTY
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.hashCode()
    }
}