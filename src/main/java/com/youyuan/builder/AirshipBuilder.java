package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 飞船构建器接口
 * @date 2018/11/27 16:08
 */
public interface AirshipBuilder {
    /**
     * 构建发动机
     * @return
     */
    Engine builderEngine();

    /**
     * 构建轨道舱
     * @return
     */
    OrbitalModel builderOrbitalMode();

    /**
     * 构建逃生舱
     * @return
     */
    Escape builderEscape();
}
