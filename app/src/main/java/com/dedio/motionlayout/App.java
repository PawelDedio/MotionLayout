package com.dedio.motionlayout;

import android.app.Application;

import com.google.android.libraries.remixer.Remixer;
import com.google.android.libraries.remixer.storage.LocalStorage;
import com.google.android.libraries.remixer.ui.RemixerInitialization;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RemixerInitialization.initRemixer(this);
        Remixer.getInstance().setSynchronizationMechanism(new LocalStorage(getApplicationContext()));
    }
}
