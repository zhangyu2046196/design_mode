package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description 飞船组装器接口
 * @date 2018/11/27 16:11
 */
public interface AirshipDirector {

    /**
     * 构建飞船bean
     * @return
     */
    Airship createAirship();
}
