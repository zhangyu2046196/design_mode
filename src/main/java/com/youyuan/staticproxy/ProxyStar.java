package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description 代理角色
 * @date 2018/11/28 21:12
 */
public class ProxyStar implements Star {
    /**
     * 真实角色作为代理角色的属性
     */
    private Star realStar;

    public ProxyStar(RealStar realStar) {
        this.realStar = realStar;
    }

    @Override
    public void faceTack() {
        System.out.println("代理角色面谈......");
    }

    @Override
    public void concludeStar() {
        System.out.println("代理角色签合同......");
    }

    @Override
    public void topTick() {
        System.out.println("代理角色订票......");
    }

    @Override
    public void sing() {
        System.out.println("真实角色唱歌......");
    }

    @Override
    public void collectMoney() {
        System.out.println("代理角色收款......");
    }
}
