package com.example.ajaysharvesh.techqpro1;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ajays on 12/8/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
