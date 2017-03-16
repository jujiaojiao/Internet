package com.example.internet;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.internet.adapter.LvAdpater;
import com.example.internet.beans.CartoonBean;
import com.example.internet.model.CartoonModel;
import com.example.internet.presenter.CartoonPresenter;
import com.example.internet.utils.MyDialog;
import com.example.internet.view.CartoonView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CartoonView{
//    private List<CartoonBean.DataBean.TopicsBean> list;
    private ListView listview;
    private CartoonPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        list = new ArrayList<>();
        listview = (ListView) findViewById(R.id.listview);
        presenter  = new CartoonPresenter(new CartoonModel(),this);
        presenter.setDatas(62);

    }

    @Override
    public void showDataSuccess(CartoonBean t) {
        List<CartoonBean.DataBean.TopicsBean> topics = t.getData().getTopics();
        LvAdpater lvAdpater = new LvAdpater(this,topics);
        listview.setAdapter(lvAdpater);
    }

    @Override
    public void showDataErro(Throwable throwable) {
        MyDialog.getInstance().showDialog(this, Color.GREEN,R.layout.dialog);
    }
}
