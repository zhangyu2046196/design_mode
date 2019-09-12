package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 低级汽车工厂
 * @date 2018/11/26 22:52
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engin createEngin() {
        return new LowEngin();
    }

    @Override
    public Sate createSate() {
        return new LowSate();
    }

    @Override
    public Ryle createRyle() {
        return new LowRyle();
    }
}
