package br.com.movieapp

import android.app.Application
import br.com.movieapp.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


//Hilt is annotation of dependency injection
@HiltAndroidApp
class MovieApp : Application() {

    override fun onCreate() {
        super.onCreate()

        //config timber of better logs in debug
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }

}