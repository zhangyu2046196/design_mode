package com.youyuan.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangyu
 * @version 1.0
 * @description 原型模式的原对象bean  浅克隆
 *
 * 原型模式：是指将原对象复制一个成新对象，复制出的对象与原对象的属性值和属性的值一样，与new对象不同的是new的新对象的属性是默认值
 *         而克隆出的对象的属性值与原对象的属性值相同
 * 浅克隆: 克隆出的对象的属性引用的是原对象的属性的地址 ,浅克隆后不管是原对象还是克隆的新对象只要修改属性值(属性的地址不能改)后，原对象和新克隆的对象属性值都会改
 * 深克隆：克隆出的对象的属性引用的重新从原对象属性克隆出的新属性的地址
 *
 * 实现原型模式方法:
 *  实现Cloneable接口，重写Object的clone方法
 *
 * @date 2018/11/27 17:47
 */
public class sheep implements Cloneable,Serializable {
    private static final long serialVersionUID = 466268622764157583L;
    //名字
    private String name;
    //时间
    private Date birday;

    //重写clone方法实现克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public sheep(String name, Date birday) {
        this.name = name;
        this.birday = birday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirday() {
        return birday;
    }

    public void setBirday(Date birday) {
        this.birday = birday;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", birday=" + birday +
                '}';
    }
}
