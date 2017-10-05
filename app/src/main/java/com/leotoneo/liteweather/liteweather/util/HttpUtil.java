package com.leotoneo.liteweather.liteweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by leo zhang on 2017/7/22 0022.
 */

public class HttpUtil {
    public static void sendHttpRequest(String addr,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(addr).build();
        client.newCall(request).enqueue(callback);

    }
}
