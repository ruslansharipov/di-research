package ru.surfstudio.android.koin_excercise.f_main

import androidx.lifecycle.SavedStateHandle
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModule = module {
    viewModel {
        val bundle = get<SavedStateHandle>()
        val route = MainRoute(bundle)
        MainViewModel(get(), route)
    }
}