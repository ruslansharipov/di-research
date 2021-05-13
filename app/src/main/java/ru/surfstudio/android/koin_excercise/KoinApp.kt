package ru.surfstudio.android.koin_excercise

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module
import ru.surfstudio.android.koin_excercise.feature.mainScreenModule

class KoinApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val networkModule = module {
            single { KoinRepository() }
        }

        startKoin {
            androidContext(this@KoinApp)
            androidLogger()
            modules(networkModule, mainScreenModule)
        }
    }
}