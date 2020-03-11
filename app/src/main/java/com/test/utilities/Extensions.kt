
package com.test.utilities

import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics


fun AppCompatActivity.getDeviceWidthInDP(): Int {
    val metrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return (metrics.widthPixels / metrics.density).toInt()
}

fun List<Any>?.isNullOrEmpty() = this == null || this.isEmpty()