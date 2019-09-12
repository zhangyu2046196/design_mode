package com.youyuan.bridge;

import jdk.nashorn.internal.ir.BreakableNode;

/**
 * @author zhangyu
 * @version 1.0
 * @description 电脑品牌
 * @date 2018/11/29 11:22
 */
public interface Brank {
    void sale();
}

/**
 * thinkpad品牌
 */
class Thinkpad implements Brank{

    @Override
    public void sale() {
        System.out.println("销售Thinkpad电脑");
    }
}

/**
 *
 */
class Dell implements Brank{

    @Override
    public void sale() {
        System.out.println("销售Dell电脑");
    }
}
