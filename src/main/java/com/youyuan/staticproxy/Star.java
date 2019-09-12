package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description 静态代理模式抽象角色接口
 *
 * 静态代理的实现原理：
 *  真实角色实现抽象角色、代理角色实现抽象角色，真实角色的对象作为代理角色的属性
 *
 * 以下场景模拟歌星开演唱会，工作内容包含面谈、签合同、订车票、唱歌、收款
 * 歌星是真实角色，经纪人是代理角色
 *
 * @date 2018/11/28 21:03
 */
public interface Star {
    /**
     * 面谈
     */
    void faceTack();

    /**
     * 签合同
     */
    void concludeStar();

    /**
     * 订票
     */
    void topTick();

    /**
     * 唱歌
     */
    void sing();

    /**
     * 收款
     */
    void collectMoney();
}
