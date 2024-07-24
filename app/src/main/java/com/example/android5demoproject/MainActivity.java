package com.example.android5demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moengage.core.Properties;
import com.moengage.core.analytics.MoEAnalyticsHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting ID
        MoEAnalyticsHelper.INSTANCE.setUniqueId(this, "Hau Le");

        //Tracking Event

        Properties properties = new Properties();
        properties.addAttribute("quantity", 2);

        MoEAnalyticsHelper.INSTANCE.trackEvent(this,"Purchase", properties);
    }
}