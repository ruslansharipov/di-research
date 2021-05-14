package ru.surfstudio.android.koin_excercise.f_main

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object MainScreenModule {

    @Provides
    fun provideAnalyticsService(
        savedStateHandle: SavedStateHandle
    ): MainRoute {
        return MainRoute(savedStateHandle)
    }
}