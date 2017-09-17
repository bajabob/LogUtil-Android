package com.bottlerocketstudios.logutilexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bottlerocketstudios.logutil.LogDebug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug.d("Hello World!")
    }
}
