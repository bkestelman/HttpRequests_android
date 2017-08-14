package com.democracy.httprequests;

import android.widget.TextView;

/**
 * EditTextViewResponse
 *
 * Has access to a TextView in some Activity or Fragment and updates its text with the server
 * response
 *
 * Created by Benito on 8/14/2017.
 */

public class EditTextViewResponse implements RequestCallback {
    private TextView mTextView;

    public EditTextViewResponse(TextView textView) {
        mTextView = textView;
    }

    @Override
    public void callback(String response) {
        mTextView.setText(response);
    }
}
