package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 引擎接口
 * @date 2018/11/26 22:42
 */
public interface Engin {

    void start();
}

/**
 * 高级引擎实现类
 */
class HightEngin implements Engin{

    @Override
    public void start() {
        System.out.println("高级引擎跑得快......");
    }
}

/**
 * 低级引擎实现类
 */
class LowEngin implements Engin{

    @Override
    public void start() {
        System.out.println("低级引擎跑得慢......");
    }
}
