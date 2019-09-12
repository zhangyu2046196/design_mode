package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 轮胎接口
 * @date 2018/11/26 22:43
 */
public interface Ryle {
    void run();
}

/**
 * 高级轮胎实现类
 */
class HightRyle implements Ryle{

    @Override
    public void run() {
        System.out.println("高级轮胎静音耐磨......");
    }
}

/**
 * 低级轮胎实现类
 */
class LowRyle implements Ryle{

    @Override
    public void run() {
        System.out.println("低级轮胎不静音且不耐磨");
    }
}
