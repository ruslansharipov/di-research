package ru.surfstudio.android.koin_excercise

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import ru.surfstudio.android.koin_excercise.f_main.mainScreenModule
import ru.surfstudio.android.koin_excercise.f_screen.featureScreenModule

class KoinApp : Application() {

    override fun onCreate() {
        super.onCreate()


        startKoin {
            androidContext(this@KoinApp)
            androidLogger()
            modules(networkModule, mainScreenModule, featureScreenModule)
        }

    }
}