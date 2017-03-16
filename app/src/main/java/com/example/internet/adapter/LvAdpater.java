package com.example.internet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.internet.R;
import com.example.internet.beans.CartoonBean;

import java.util.List;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public class LvAdpater extends BaseAdapter{
    private List<CartoonBean.DataBean.TopicsBean> list;
    private Context context;
    public LvAdpater(Context context,List<CartoonBean.DataBean.TopicsBean> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CartoonBean.DataBean.TopicsBean topicsBean = list.get(position);
        ViewHolder holder = null;
        if (convertView==null){
            holder  = new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item, null);
            holder.nickname = (TextView) convertView.findViewById(R.id.nickname);
            holder.title = (TextView)convertView.findViewById(R.id.title);
            holder.img = (ImageView)convertView.findViewById(R.id.img);
            convertView.setTag(holder);
        }
        holder = (ViewHolder) convertView.getTag();
        holder.title.setText(topicsBean.getTitle());
        holder.nickname.setText(topicsBean.getUser().getNickname());
        Glide.with(context).load(topicsBean.getCover_image_url()).into(holder.img);
        return convertView;
    }


    class ViewHolder {
        private TextView title;
        private TextView nickname;
        private ImageView img;
    }
}
