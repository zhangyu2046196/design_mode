package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description ÊÊÅäÆ÷Ä£Ê½²âÊÔ
 * @date 2018/11/27 22:36
 */
public class ClientTest {
    public static void main(String[] args) {
        //ÀàÊÊÅäÆ÷²âÊÔ
        Target target=new Adapter1();
        target.request();

        //¶ÔÏóÊÊÅäÆ÷²âÊÔ
        Adapter2 adapter2=new Adapter2(new Adaptee());
        adapter2.request();
    }
}
