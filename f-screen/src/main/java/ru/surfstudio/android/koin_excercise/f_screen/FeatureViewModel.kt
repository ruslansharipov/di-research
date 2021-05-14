package ru.surfstudio.android.koin_excercise.f_screen

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeatureViewModel @Inject constructor(
    private val route: FeatureRoute
): ViewModel() {

    init {
        Log.d("Feature", "args: ${route.args}")
    }
}