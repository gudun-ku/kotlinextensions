package ru.skillbranch.extensions.utils

import android.view.View

// View.VISIBLE
// View.GONE
// VIew.INVISIBLE

fun View.isVisible() = visibility == View.VISIBLE
fun View.isGone()= visibility == View.GONE
fun View.isInvisible() = visibility == View.INVISIBLE

// FUNCTIONS

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}


fun View.switchVisibility() {
    if(isVisible()) {
        gone()
    } else {
        visible()
    }
}



fun visibilitySample() {
    val view = view()

    //if (view.visibility == View.VISIBLE)
    view.switchVisibility()
}