package ru.surfstudio.android.koin_excercise.i_repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class KoinRepository @Inject constructor(){

    fun getMessage(): String {
        return "message"
    }
}