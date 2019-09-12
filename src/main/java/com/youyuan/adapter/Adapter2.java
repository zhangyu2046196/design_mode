package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description 对象适配器 通过将被适配的对象传递进来
 * @date 2018/11/27 22:34
 */
public class Adapter2 implements Target {
    //被适配的类
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.message();
    }
}
