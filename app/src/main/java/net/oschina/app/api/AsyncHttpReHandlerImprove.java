package net.oschina.app.api;

import android.os.Looper;

import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

/**
 * @author Mr.bingley
 * @version 1.0.0
 * @des $des$
 * @since 2016/10/16.
 */
public class AsyncHttpReHandlerImprove extends AsyncHttpResponseHandler {

    private Object[] args;
    public AsyncHttpReHandlerImprove(Looper looper) {
        super(looper);
    }

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

    }

    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

    }
}
