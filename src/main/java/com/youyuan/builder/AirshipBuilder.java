package com.youyuan.builder;

/**
 * @author zhangyu
 * @version 1.0
 * @description �ɴ��������ӿ�
 * @date 2018/11/27 16:08
 */
public interface AirshipBuilder {
    /**
     * ����������
     * @return
     */
    Engine builderEngine();

    /**
     * ���������
     * @return
     */
    OrbitalModel builderOrbitalMode();

    /**
     * ����������
     * @return
     */
    Escape builderEscape();
}
