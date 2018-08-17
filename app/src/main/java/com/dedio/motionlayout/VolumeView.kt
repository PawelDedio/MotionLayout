package com.dedio.motionlayout

import android.content.Context
import android.media.AudioManager
import android.util.AttributeSet
import android.view.View

class VolumeView : View {

    private val audioManager: AudioManager

    constructor(context: Context?) : super(context) {
        init(context, null)
        audioManager = context?.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
        audioManager = context?.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
        audioManager = context?.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    }

    private fun init(context: Context?, attrs: AttributeSet?) {

    }

    fun setVolume(level: Int) {
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, level, 0)
    }

    fun getVolume(): Int {
        return audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
    }
}