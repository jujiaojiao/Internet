package com.example.internet.view;

import com.example.internet.beans.CartoonBean;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public interface CartoonView extends BaseView<CartoonBean> {
    void showDataSuccess(CartoonBean t);
    void showDataErro(Throwable throwable);
}
