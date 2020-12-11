package se.fork.customclicker.extensions

import android.os.SystemClock
import android.view.View
import timber.log.Timber

fun View.onClickWithDebounce(debounceTime: Long = 500L, action: (View) -> Unit) {
    this.setOnClickListener(object : View.OnClickListener {
        private var lastClickTime: Long = 0

        override fun onClick(v: View) {
            if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime)
                return
            else {
                action(v)
                Timber.d("onClick: trackingName = ${v.trackingName}")
                Timber.d("onClick: trackingProduct = ${v.trackingProduct}")
            }

            lastClickTime = SystemClock.elapsedRealtime()
        }
    })
}