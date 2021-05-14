package ru.surfstudio.android.koin_excercise.f_screen

import android.util.Log
import androidx.lifecycle.ViewModel

class FeatureViewModel(
    private val route: FeatureRoute
): ViewModel() {

    init {
        Log.d("Feature", "args: ${route.args}")
    }
}