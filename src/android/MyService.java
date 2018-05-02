package com.coloz.myservice;

import android.app.IntentService;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;


public class MyService extends IntentService {

    public MyService() {
        super("HelloIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }
  }
