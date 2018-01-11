package com.reemanye.yelibs.myokhttp.response;

/**
 * Created by ye on 2017/10/16.
 */

public interface IResponseHandler {
    void onFailure (int statusCode, String error_msg);

    void onProgress (long currentBytes, long totalBytes);
}
