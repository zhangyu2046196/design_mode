package com.youyuan.bridge;

import jdk.nashorn.internal.ir.BreakableNode;

/**
 * @author zhangyu
 * @version 1.0
 * @description ����Ʒ��
 * @date 2018/11/29 11:22
 */
public interface Brank {
    void sale();
}

/**
 * thinkpadƷ��
 */
class Thinkpad implements Brank{

    @Override
    public void sale() {
        System.out.println("����Thinkpad����");
    }
}

/**
 *
 */
class Dell implements Brank{

    @Override
    public void sale() {
        System.out.println("����Dell����");
    }
}
