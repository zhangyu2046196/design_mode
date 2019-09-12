package com.youyuan.adapter;

/**
 * @author zhangyu
 * @version 1.0
 * @description 类适配器  通过继承被适配的对象和实现目标接口
 * @date 2018/11/27 22:33
 */
public class Adapter1 extends Adaptee implements Target {
    @Override
    public void request() {
        super.message();
    }
}
