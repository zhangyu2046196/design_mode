package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description װ����ʵ�ֽӿ�
 * @date 2018/11/27 16:15
 */
public class AirshipDirectorImp implements AirshipDirector {
    /**
     * ������
     */
    private Engine engine;
    /**
     * �����
     */
    private OrbitalModel orbitalModel;
    /**
     * ������
     */
    private Escape escape;

    public AirshipDirectorImp(Engine engine, OrbitalModel orbitalModel, Escape escape) {
        this.engine = engine;
        this.orbitalModel = orbitalModel;
        this.escape = escape;
    }

    @Override
    public Airship createAirship() {
        return new Airship(engine,orbitalModel,escape);
    }
}
