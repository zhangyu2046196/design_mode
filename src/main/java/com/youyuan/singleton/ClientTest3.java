package com.youyuan.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangyu
 * @version 1.0
 * @description 通过CountDownLatch来多线程测试创建单例的效率
 * @date 2018/11/25 20:53
 */
public class ClientTest3 {
    public static void main(String[] args) throws InterruptedException {
        int number=10;
        final CountDownLatch countDownLatch=new CountDownLatch(number);//线程数，原理是主线程中断，countdownlatch里面有个计数器，启动一个线程计数器加1，当线程执行完计数器减1，当计数器为0代表线程全部执行完
        long start=System.currentTimeMillis();
        //循环number次
        for (int i=1;i<=number;i++){
            new Thread(()->{
                for (int j=1;j<=1000000;j++){
                    //Object obj1=SingletonTest1.getInstance();
                    //Object obj2=SingletonTest2.getInstance();
                    //Object obj3=SingletonTest3.getInstance();
                    Object obj4=SingletonTest4.INSTANCE;
                }
                countDownLatch.countDown();//计数器减1
            }).start();
        }
        //主线程中断等待
        countDownLatch.await();
        long end=System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)+"毫秒");
    }
}
