package com.youyuan.composite;

import java.util.concurrent.ForkJoinTask;

/**
 * @author zhangyu
 * @version 1.0
 * @description ���ģʽ���� (���ģʽʹ���봦�����ͽṹ����)
 * @date 2018/11/29 14:20
 */
public class ClientTest {

    public static void main(String[] args) {
        ImageFile imageFile=new ImageFile("����");
        TextFile textFile=new TextFile("����");
        VedioFile vedioFile=new VedioFile("��Ӱ");
        Fold fold=new Fold("�ղؼ�");
        fold.add(textFile);
        fold.add(vedioFile);

        imageFile.killVure();
        fold.killVure();
    }

}
