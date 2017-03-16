package com.example.internet.utils;

import okhttp3.OkHttpClient;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public class SetCacheUtils {
    public static OkHttpClient setCache(){
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        return client;
    }
}