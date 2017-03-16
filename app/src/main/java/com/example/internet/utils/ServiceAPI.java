package com.example.internet.utils;


import com.example.internet.beans.CartoonBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public interface ServiceAPI {
//    http://api.kkmh.com/v1/topic_new/discovery_module_list/62?offset=0&limit=20
    @GET("v1/topic_new/discovery_module_list/{id}?offset=0&limit=20")
    Call<CartoonBean> getCartoon(@Path("id") int id);
}
