package ru.surfstudio.android.koin_excercise.f_screen

import androidx.lifecycle.SavedStateHandle

class FeatureRoute(val args: String) {

    constructor(savedStateHandle: SavedStateHandle): this(savedStateHandle.get<String>("args") ?: "")
}