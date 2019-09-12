package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 北京飞船构建器
 * @date 2018/11/27 16:12
 */
public class BjAirshipBuilder implements AirshipBuilder {
    @Override
    public Engine builderEngine() {
        return new BjEngine();
    }

    @Override
    public OrbitalModel builderOrbitalMode() {
        return new BjOrbitalModel();
    }

    @Override
    public Escape builderEscape() {
        return new BjEscape();
    }
}
