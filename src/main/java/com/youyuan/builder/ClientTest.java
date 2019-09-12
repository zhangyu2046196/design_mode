package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description ������ģʽ������
 * @date 2018/11/27 16:17
 */
public class ClientTest {
    public static void main(String[] args) {
        BjAirshipBuilder bjAirshipBuilder=new BjAirshipBuilder();//�����ƹ�����
        ShAirshipBuilder shAirshipBuilder=new ShAirshipBuilder();//�Ϻ��ƹ�����
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
