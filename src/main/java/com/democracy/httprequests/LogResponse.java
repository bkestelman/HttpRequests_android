package com.democracy.httprequests;

import android.util.Log;

/**
 * Simplest example of what you might do with the callback.
 * Implement RequestCallback using classes similar to this one.
 *
 * Created by Benito on 8/13/2017.
 */

public class LogResponse implements RequestCallback {

    private static String RESPONSE_TAG = "Http Response";

    @Override
    public void callback(String response) {
        Log.d(RESPONSE_TAG, response);
    }
}
