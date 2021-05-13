package ru.surfstudio.android.koin_excercise.main

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.surfstudio.android.koin_excercise.KoinRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
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