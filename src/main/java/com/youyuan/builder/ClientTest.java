package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 建造者模式测试类
 * @date 2018/11/27 16:17
 */
public class ClientTest {
    public static void main(String[] args) {
        BjAirshipBuilder bjAirshipBuilder=new BjAirshipBuilder();//北京牌构建器
        ShAirshipBuilder shAirshipBuilder=new ShAirshipBuilder();//上海牌构建器
        Airship bjAirship= new AirshipDirectorImp(bjAirshipBuilder.builderEngine(),bjAirshipBuilder.builderOrbitalMode(),bjAirshipBuilder.builderEscape()).createAirship();
        Airship shAirship= new AirshipDirectorImp(shAirshipBuilder.builderEngine(),shAirshipBuilder.builderOrbitalMode(),shAirshipBuilder.builderEscape()).createAirship();

        bjAirship.getEngine().start();
        bjAirship.getOrbitalModel().message();
        bjAirship.getEscape().run();
        shAirship.getEngine().start();
        shAirship.getOrbitalModel().message();
        shAirship.getEscape().run();
    }
}
