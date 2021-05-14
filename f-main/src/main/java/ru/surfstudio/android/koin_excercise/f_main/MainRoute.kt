package ru.surfstudio.android.koin_excercise.f_main

import androidx.lifecycle.SavedStateHandle

class MainRoute(val screenId: String) {

    constructor(bundle: SavedStateHandle): this(bundle.get<String>("screen_id") ?: "")
}