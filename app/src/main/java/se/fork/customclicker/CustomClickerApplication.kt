package se.fork.customclicker

import android.app.Application
import com.facebook.stetho.Stetho
import timber.log.Timber

class CustomClickerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(if (BuildConfig.DEBUG) Timber.DebugTree() else ReleaseTree())
        Timber.d("onCreate: Timber working!!")

        Stetho.initializeWithDefaults(this)
        Timber.d("onCreate: Stetho initialized")
    }

    private class ReleaseTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            // No-op
        }
    }
}