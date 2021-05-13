package ru.surfstudio.android.koin_excercise.feature

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object FeatureScreenModule {

    @Provides
    fun provideRouteService(
        savedStateHandle: SavedStateHandle
    ): FeatureRoute {
        return FeatureRoute(savedStateHandle)
    }
}