package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 汽车工厂
 * @date 2018/11/26 22:49
 */
public interface CarFactory {
    /**
     * 生产引擎接口
     * @return 返回引擎bean
     */
    Engin createEngin();

    /**
     * 生产座椅接口
     * @return 返回座椅bean
     */
    Sate createSate();

    /**
     * 生产轮胎接口
     * @return 返回轮胎bean
     */
    Ryle createRyle();
}
