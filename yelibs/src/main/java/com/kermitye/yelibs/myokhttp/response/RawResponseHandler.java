package com.kermitye.yelibs.myokhttp.response;

/**
 * Created by ye on 2017/10/16.
 */

public abstract class RawResponseHandler implements IResponseHandler {
    public abstract void onSuccess(int statusCode, String response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
