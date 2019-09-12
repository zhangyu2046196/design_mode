package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 上海牌构建器
 * @date 2018/11/27 16:13
 */
public class ShAirshipBuilder implements AirshipBuilder {
    @Override
    public Engine builderEngine() {
        return new ShEngine();
    }

    @Override
    public OrbitalModel builderOrbitalMode() {
        return new ShOrbitalModel();
    }

    @Override
    public Escape builderEscape() {
        return new ShEscape();
    }
}
