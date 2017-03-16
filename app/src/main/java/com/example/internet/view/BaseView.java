package com.example.internet.view;

/**
 * Created by ${jujiaojiao} on 2017/3/15.
 */

public interface BaseView <T>{
//    http://a121.baopiqi.com/api/mh/getClassificationMakeComplaintsContentFour.php?limit=20&first=1&id=1&appname=%E7%89%B9%E5%88%AB%E7%9C%8B%E7%82%B9&pkgname=com.tools.news&imei=000000000000000&os=android&ver=2.0.2&androidid=ffffffff-f617-6c94-ffff-ffff99d603a9&ip=192.168.0.1&timestamp=1476065377&md5=56aee53f6542c6afa3dbb4143f89903b&network=WIFI&install=%5B%22%E8%B4%A2%E7%BB%8F%22%2C%22%E6%90%9E%E7%AC%91%22%2C%22%E5%A8%B1%E4%B9%90%22%2C%22%E7%A7%91%E6%8A%80%22%2C%22%E4%BD%93%E8%82%B2%22%5D&viewlist=%5B%22%E4%BD&page=0
//
    void showDataSuccess(T t);
    void showDataErro(Throwable throwable);
}
