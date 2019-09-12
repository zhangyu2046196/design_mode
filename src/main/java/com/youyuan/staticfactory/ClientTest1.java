package com.youyuan.staticfactory;

/**
 * @author zhangyu
 * @version 1.0
 * @description 静态工厂模式测试
 * 工厂模式就是创建者和调用者解耦，对象的实例化方式用工厂方法代替new
 * 静态工厂就是工厂的方法是静态，工厂和实现类交互，工厂负责实例化对象的创建和管理，调用者不用关心实现类
 * @date 2018/11/25 22:00
 */
public class ClientTest1 {
    public static void main(String[] args) {
        Car audi=StaticFactory.createAudi();//创建奥迪对象
        Car bmw=StaticFactory.createBmw();//创建宝马对象
        audi.run();
        bmw.run();
    }
}
