package com.dedio.motionlayout

import android.os.Bundle
import android.support.v4.app.FragmentActivity
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
        remixerFragment.attachToShake(this, 4.0)
    }

    override fun onPause() {
        super.onPause()
        remixerFragment.detachFromShake()
    }

    @StringListVariableMethod(key = "layout", title = "layout", limitedToValues =
    [R.layout.activity_main1.toString(), R.layout.activity_main2.toString(),
        R.layout.activity_main3.toString(), R.layout.activity_main4.toString(),
        R.layout.activity_main5.toString(), R.layout.activity_main6.toString(),
        R.layout.activity_main7.toString()])
    fun changeLayout(layout: java.lang.String) {
        setContentView(java.lang.Integer.parseInt(layout.toString()))
    }
}
