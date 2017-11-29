package com.indi.jinlu.establish;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();  //指向自己实例的私有静态引用
    private HungrySingleton(){}      //私有的构造方法
    public static HungrySingleton getInstance(){   //以自己实例为返回值的静态的公有的方法
        return hungrySingleton;
    }
}
