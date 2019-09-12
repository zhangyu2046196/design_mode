package com.youyuan.builder;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description 用构建飞船为例子讲解建造者模式
 *  此为飞船模型bean
 * @date 2018/11/27 15:56
 */
public class Airship implements Serializable {
    private static final long serialVersionUID = -1241042807547860623L;
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

    public Airship(Engine engine, OrbitalModel orbitalModel, Escape escape) {
        this.engine = engine;
        this.orbitalModel = orbitalModel;
        this.escape = escape;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public OrbitalModel getOrbitalModel() {
        return orbitalModel;
    }

    public void setOrbitalModel(OrbitalModel orbitalModel) {
        this.orbitalModel = orbitalModel;
    }

    public Escape getEscape() {
        return escape;
    }

    public void setEscape(Escape escape) {
        this.escape = escape;
    }
}
