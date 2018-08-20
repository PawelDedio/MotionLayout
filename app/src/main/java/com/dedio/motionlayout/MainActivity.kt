package com.dedio.motionlayout

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import com.google.android.libraries.remixer.annotation.RemixerBinder
import com.google.android.libraries.remixer.annotation.StringListVariableMethod
import com.google.android.libraries.remixer.ui.view.RemixerFragment

class MainActivity : FragmentActivity() {

    private lateinit var remixerFragment: RemixerFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        RemixerBinder.bind(this)
        remixerFragment = RemixerFragment.newInstance()
    }

    override fun onResume() {
        super.onResume()
        remixerFragment.attachToShake(this, 20.0)
    }

    override fun onPause() {
        super.onPause()
        remixerFragment.detachFromShake()
    }

    @StringListVariableMethod(key = "layouttttttt", title = "layout", limitedToValues =
    [R.layout.activity_main1.toString(), R.layout.activity_main2.toString(),
        R.layout.activity_main3.toString(), R.layout.activity_main4.toString(), R.layout.activity_main5.toString()])
    fun changeLayout(layout: java.lang.String) {
        setContentView(java.lang.Integer.parseInt(layout.toString()))
    }
}
