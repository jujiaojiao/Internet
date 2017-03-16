package com.example.internet.utils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.LayoutRes;


/**
 * Created by ${jujiaojiao} on 2017/3/1.
 */

public class MyDialog {
    private static MyDialog myDialog  = null;
    public Dialog dialog = null;
    public AlertDialog.Builder alertDialog;

    private MyDialog(){}
    public static MyDialog getInstance(){
        if (myDialog==null){
            synchronized (MyDialog.class){
                if (myDialog==null){
                    myDialog = new MyDialog();
                }
            }
        }
        return myDialog;
    }

    //显示dialog
    public  void  showDialog(Context context, int color,@LayoutRes int layout ){
        dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(color));
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(layout);
        dialog.show();
    }

}
