package com.example.internet.model;

import com.example.internet.beans.CartoonBean;
import com.example.internet.utils.ServiceAPI;
import com.example.internet.utils.SetCacheUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public class CartoonModel implements BaseModel {


    @Override
    public void getData(int id, final OnCartoonDataListenter onCartoonDataListenter) {
        new Retrofit.Builder()
                .baseUrl("http://api.kkmh.com/")
                .client(SetCacheUtils.setCache())
                .addConverterFactory(GsonConverterFactory.create())//创建Gson解析的Factory
                .build()
                .create(ServiceAPI.class)
                .getCartoon(id)
                .enqueue(new Callback<CartoonBean>() {
                    @Override
                    public void onResponse(Call<CartoonBean> call, Response<CartoonBean> response) {
                        CartoonBean cartoonBean = response.body();
                        onCartoonDataListenter.OnCartoonSuccess(cartoonBean);
                    }

                    @Override
                    public void onFailure(Call<CartoonBean> call, Throwable t) {
                        onCartoonDataListenter.OnCarttonError(new Throwable("请求失败" +
                                ""));
                    }
                });
    }
}
