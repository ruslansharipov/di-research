package ru.surfstudio.android.koin_excercise.f_main

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.surfstudio.android.koin_excercise.i_repository.KoinRepository

class MainViewModel(
    private val repository: KoinRepository,
    private val route: MainRoute
) : ViewModel() {

    init {
        Log.d("Main", "repo: ${repository.hashCode()}, route: ${route.hashCode()}")
    }

    fun doSomething() {
        Log.d("Main", "do something")
    }

}