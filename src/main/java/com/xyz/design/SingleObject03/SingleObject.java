package com.xyz.design.SingleObject03;

/**
 * 单例模式
 */
public class SingleObject {
    //创建SingleObject的一对象
    private static SingleObject instance=new SingleObject();

    //构造方法私有化  是此类不能被创建
    private SingleObject(){}

    //通过此方法获取对象
    public  static SingleObject getSingleObject(){
        return instance;
    }

    public  void  showMessage()
    {
        System.out.println("Hello Word");
    }



}
