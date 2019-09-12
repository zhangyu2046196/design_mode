package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 座椅接口
 * @date 2018/11/26 22:43
 */
public interface Sate {
    void message();
}

/**
 * 高级座椅实现类
 */
class HightSate implements Sate{

    @Override
    public void message() {
        System.out.println("高级座椅通风......");
    }
}

/**
 * 低级座椅实现类
 */
class LowSate implements Sate{

    @Override
    public void message() {
        System.out.println("低级座椅不通风......");
    }
}
