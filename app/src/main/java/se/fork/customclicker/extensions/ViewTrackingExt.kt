package se.fork.customclicker.extensions

import android.view.View
import androidx.databinding.BindingAdapter
import se.fork.customclicker.R

@set:BindingAdapter("trackingName")
var View.trackingName: String
    get() = getTag(R.id.tag_trackingName) as String
    set(value) = setTag(R.id.tag_trackingName, value)

@set:BindingAdapter("trackingProduct")
var View.trackingProduct: String
    get() = getTag(R.id.tag_trackingProduct) as String
    set(value) = setTag(R.id.tag_trackingProduct, value)

