package com.example.android5demoproject;

import android.app.Application;

import com.moengage.core.DataCenter;
import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.LogConfig;
import com.moengage.core.config.NotificationConfig;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();



        MoEngage moEngage = new MoEngage.Builder(this, "OXTAVQZDWWAROL2ESF8FWE8G", DataCenter.DATA_CENTER_1)
                .configureLogs(new LogConfig(LogLevel.VERBOSE))
                .configureNotificationMetaData(new NotificationConfig(R.drawable.abhi, R.drawable.abhi))
                     .build();
        MoEngage.initialiseDefaultInstance(moEngage);


    }
}
