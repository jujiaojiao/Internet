package com.example.internet.presenter;

import android.content.Context;

import com.example.internet.beans.CartoonBean;
import com.example.internet.model.BaseModel;
import com.example.internet.model.CartoonModel;
import com.example.internet.view.CartoonView;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public class CartoonPresenter implements BasePresenter<CartoonModel,CartoonView> {
    private CartoonModel cartoonModel;
    private  CartoonView cartoonView;
    private Context context;

    public CartoonPresenter(CartoonModel model,CartoonView view){
        this.cartoonModel = model;
        this.cartoonView = view;

    }

    @Override
    public void setDatas(int id) {
        cartoonModel.getData(id, new BaseModel.OnCartoonDataListenter() {
            @Override
            public void OnCartoonSuccess(Object o) {
                if (o!=null&&o instanceof CartoonBean){
                    cartoonView.showDataSuccess((CartoonBean) o);
                }
            }

            @Override
            public void OnCarttonError(Throwable throwable) {

            }
        });
    }
}
