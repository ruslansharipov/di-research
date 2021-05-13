package ru.surfstudio.android.koin_excercise.feature

import android.content.Intent
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModule = module {
    viewModel { (intent: Intent) ->
        MainViewModel(get(), MainRoute(intent))
    }
}