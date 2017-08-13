# HttpRequests_android
Wrapper for Volley. Write less code for simple requests

```
String url = "http://myserver.com/hello/";

// Access the HttpRequestManager singleton
HttpRequestManager httpRequestManager = HttpRequestManager.getInstance(getApplicationContext());

// Choose a Callback implementation. The Callback interface contains a callback() method, which is called once you receive a response from
the server. You can use one of the preset Callback implementations here, or implement the Callback interface and override callback() to
make your own. 
LogResponse logResponse = new LogResponse(); // The simplest Callback

/* POST Example */
// Set up key-value data to send to server
Map<String, String> params = new HashMap<String, String>();
params.put("aKey", "aValue");
params.put("token", result.getSignInAccount().getIdToken()); // This is how you'd send a GoogleID token if you're using Google Sign In

// Send the request
httpRequestManager.POST(url, params, logResponse); // url, data/params, Callback... boom, boom, boom
```
