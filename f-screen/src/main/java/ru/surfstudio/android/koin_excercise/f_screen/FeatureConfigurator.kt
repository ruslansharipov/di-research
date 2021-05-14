package ru.surfstudio.android.koin_excercise.f_screen

import androidx.lifecycle.SavedStateHandle
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureScreenModule = module {
    viewModel {
        val savedStateHandle = get<SavedStateHandle>()
        val route = FeatureRoute(savedStateHandle)
        FeatureViewModel(route)
    }
}