package com.example.koinpractice

import android.app.Application
import com.example.koinpractice.koin.koinTeachingModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// Extending Application() to use our own Application class that gets initiated each time the app launches
class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@MyApp)
            // Only inserting one module as this is the only example I am Practicing
            modules(koinTeachingModules)
        }
    }
}

