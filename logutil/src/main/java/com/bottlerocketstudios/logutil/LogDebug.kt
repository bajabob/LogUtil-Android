package com.bottlerocketstudios.logutil

import android.util.Log

class LogDebug {
    companion object {
        fun d(msg:String) {
            Log.d("My Awesome Lib", msg)
        }
    }
}