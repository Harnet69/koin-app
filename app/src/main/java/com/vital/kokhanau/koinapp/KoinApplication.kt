package com.vital.kokhanau.koinapp

import android.app.Application
import com.vital.kokhanau.koinapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@KoinApplication)
            modules(listOf(appModule))
        }
    }
}
