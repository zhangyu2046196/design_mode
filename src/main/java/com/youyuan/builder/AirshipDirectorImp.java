package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 装配器实现接口
 * @date 2018/11/27 16:15
 */
public class AirshipDirectorImp implements AirshipDirector {
    /**
     * 发动机
     */
    private Engine engine;
    /**
     * 轨道舱
     */
    private OrbitalModel orbitalModel;
    /**
     * 逃生舱
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
