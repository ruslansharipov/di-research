package ru.surfstudio.android.koin_excercise.f_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.stateViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by stateViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            viewModel.doSomething()

            val clazz = Class.forName("ru.surfstudio.android.koin_excercise.f_screen.FeatureActivity")
            val intent = Intent(this, clazz)
            intent.putExtra("args", "super cool args")
            startActivity(intent)
        }
    }
}