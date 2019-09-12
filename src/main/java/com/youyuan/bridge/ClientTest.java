package com.youyuan.bridge;

/**
 * @author zhangyu
 * @version 1.0
 * @description ≤‚ ‘«≈Ω”
 * @date 2018/11/29 11:47
 */
public class ClientTest {

    public static void main(String[] args) {
        Brank brank=new Thinkpad();
        Computer deskTop=new DeskTop(brank);
        deskTop.sale();
    }

}
