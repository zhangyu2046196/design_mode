package com.youyuan.staticproxy;

/**
 * @author zhangyu
 * @version 1.0
 * @description ��̬����ģʽ����
 *
 * ģ����Ǻ;�����
 *
 * @date 2018/11/28 21:14
 */
public class ClientTest {

    public static void main(String[] args) {
        Star realStar=new RealStar();
        Star proxyStar=new ProxyStar((RealStar) realStar);
        proxyStar.faceTack();
        proxyStar.concludeStar();
        proxyStar.topTick();
        proxyStar.sing();
        proxyStar.collectMoney();
    }

}
