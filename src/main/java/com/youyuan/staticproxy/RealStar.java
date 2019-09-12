package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description 真实角色
 * @date 2018/11/28 21:10
 */
public class RealStar implements Star {
    @Override
    public void faceTack() {
        System.out.println("真实角色收款......");
    }

    @Override
    public void concludeStar() {
        System.out.println("真实角色签合同......");
    }

    @Override
    public void topTick() {
        System.out.println("真实角色订票......");
    }

    @Override
    public void sing() {
        System.out.println("真实角色唱歌......");
    }

    @Override
    public void collectMoney() {
        System.out.println("真实角色收款......");
    }
}
