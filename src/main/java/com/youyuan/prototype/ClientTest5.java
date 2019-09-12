package com.youyuan.prototype;

/**
 * @author zhangyu
 * @version 1.0
 * @description new对象和原型模式clone克隆的方式性能对比
 * @date 2018/11/27 20:10
 */
public class ClientTest5 {

    public static void main(String[] args) {
        int size=1000;
        createNew(size);
        createClone(size);
    }

    /**
     * new的方式创建对象耗时
     * @param size 创建对象数
     */
    public static void createNew(int size){
        long start=System.currentTimeMillis();
        for (int i=1;i<=size;i++){
            Book b=new Book();
        }
        long end=System.currentTimeMillis();
        System.out.println("new对象方式耗时:"+(end-start));
    }

    /**
     * 原型模式创建对象耗时
     * @param size 创建对象数量
     */
    public static void createClone(int size){
        long start=System.currentTimeMillis();
        Book b=new Book();
        for (int i=1;i<=size;i++){
            try {
                Book tmp= (Book) b.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("clone克隆对象耗时:"+(end-start));
    }

}

/**
 * 测试bean
 */
class Book implements Cloneable{
    public Book(){
        try {
            //模拟网络延迟
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
