package com.democracy.httprequests;

/**
 * StoreStringResponse
 *
 * Stores a String Http response
 *
 * IMPORTANT: This class is useless as far as I know. Consider:
 * 1. You make a StoreStringResponse to store a response
 * 2. You make your Http request
 * 3. You try to access the value mResponse stored in StoreStringResponse
 * 4. You cry because it's null, because the server has not yet sent the response
 *
 * Consider using something like EditTextViewResponse instead
 *
 * Created by Benito on 8/13/2017.
 */

public class StoreStringResponse implements RequestCallback {

    private String mResponse;

    @Override
    public void callback(String response) {
        mResponse = response;
    }

    public String getResponse() {
        return mResponse;
    }

}
