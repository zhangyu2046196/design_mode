package com.youyuan.builder;

import java.io.Serializable;

/**
 * @author zhangyu
 * @version 1.0
 * @description �ù����ɴ�Ϊ���ӽ��⽨����ģʽ
 *  ��Ϊ�ɴ�ģ��bean
 * @date 2018/11/27 15:56
 */
public class Airship implements Serializable {
    private static final long serialVersionUID = -1241042807547860623L;
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
