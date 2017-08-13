package com.democracy.httprequests;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * Created by Benito on 8/13/2017.
 */

public class HttpRequestManager {

    private static HttpRequestManager singleton;

    private RequestQueue rq;

    private HttpRequestManager(Context context) {
        rq = Volley.newRequestQueue(context);
    }

    /**
     * This is how you access the HttpRequestManager singleton
     * @param context The Context of the calling Activity
     * @return HttpRequestManager
     */
    public static HttpRequestManager getInstance(Context context) {
        if(singleton == null)
            singleton = new HttpRequestManager(context);
        return singleton;
    }

    /**
     * Simplified method for making a POST request.
     * @param url server destination url for request
     * @param data key-value map of data
     * @param callback function to call upon receiving response
     */
    public void POST(String url, Map<String, String> data, final RequestCallback callback) {
        final Map<String, String> params = data;
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, // Test POST
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.callback(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                return params;
            }
        };
        // Add the request to the RequestQueue.
        rq.add(stringRequest);
    }
}
