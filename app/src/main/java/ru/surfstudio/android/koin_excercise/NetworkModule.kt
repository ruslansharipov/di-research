package ru.surfstudio.android.koin_excercise

import org.koin.dsl.module
import ru.surfstudio.android.koin_excercise.i_repository.KoinRepository

val networkModule = module {
    single { KoinRepository() }
}