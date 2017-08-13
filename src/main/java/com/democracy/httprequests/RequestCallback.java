package com.democracy.httprequests;

/**
 * Use to implement callback for HTTP response after sending a request
 *
 * Created by Benito on 8/13/2017.
 */

public interface RequestCallback {
    void callback(String response);
}
