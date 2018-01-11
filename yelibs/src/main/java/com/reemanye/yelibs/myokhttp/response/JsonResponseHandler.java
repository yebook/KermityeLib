package com.reemanye.yelibs.myokhttp.response;

import org.json.JSONObject;

/**
 * Created by ye on 2017/10/16.
 */

public abstract class JsonResponseHandler implements IResponseHandler{
    public abstract void onSuccess(int statusCode, JSONObject response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
