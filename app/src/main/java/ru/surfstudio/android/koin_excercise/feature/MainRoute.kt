package ru.surfstudio.android.koin_excercise.feature

import android.content.Intent

class MainRoute(val screenId: String) {

    constructor(intent: Intent): this(intent.getStringExtra("screen_id") ?: "")
}