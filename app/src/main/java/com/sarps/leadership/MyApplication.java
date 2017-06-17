package com.sarps.leadership;

import android.app.Application;
import android.content.Intent;

/**
 * Created by Sarps on 11/28/2016.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
