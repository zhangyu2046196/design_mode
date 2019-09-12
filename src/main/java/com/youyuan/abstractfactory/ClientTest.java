package com.youyuan.abstractfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description  ≥ÈœÛπ§≥ß≤‚ ‘
 * @date 2018/11/26 22:54
 */
public class ClientTest {
    public static void main(String[] args) {
        Engin hightEngin=new HightCarFactory().createEngin();
        Engin lowEngin=new LowCarFactory().createEngin();
        Sate hightSate=new HightCarFactory().createSate();
        Sate lowSate=new LowCarFactory().createSate();
        Ryle hightRyle=new HightCarFactory().createRyle();
        Ryle lowRyle=new LowCarFactory().createRyle();
        hightEngin.start();
        lowEngin.start();
        hightSate.message();
        lowSate.message();
        hightRyle.run();
        lowRyle.run();
    }
}
