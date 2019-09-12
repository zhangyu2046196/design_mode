package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 高级汽车工厂
 * @date 2018/11/26 22:51
 */
public class HightCarFactory implements CarFactory {
    @Override
    public Engin createEngin() {
        return new HightEngin();
    }

    @Override
    public Sate createSate() {
        return new HightSate();
    }

    @Override
    public Ryle createRyle() {
        return new HightRyle();
    }
}
