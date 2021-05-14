package ru.surfstudio.android.koin_excercise.f_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.doSomething()

        val clazz = Class.forName("ru.surfstudio.android.koin_excercise.f_screen.FeatureActivity")
        val intent = Intent(this, clazz)
        intent.putExtra("args", "super cool args")
        startActivity(intent)
    }
}