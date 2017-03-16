package com.example.internet.model;


/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public interface BaseModel {
    void getData(int id,OnCartoonDataListenter onCartoonDataListenter);
    public interface OnCartoonDataListenter<T> {
        void OnCartoonSuccess(T t);
        void OnCarttonError(Throwable throwable);
    }
}

