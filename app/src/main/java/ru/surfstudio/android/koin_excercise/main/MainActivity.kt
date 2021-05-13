package ru.surfstudio.android.koin_excercise.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.surfstudio.android.koin_excercise.R
import ru.surfstudio.android.koin_excercise.feature.FeatureActivity

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.doSomething()
        val intent = Intent(this, FeatureActivity::class.java)
        intent.putExtra("args", "super cool args")
        startActivity(intent)
    }
}