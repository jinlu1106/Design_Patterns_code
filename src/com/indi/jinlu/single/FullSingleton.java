package com.indi.jinlu.single;

public class FullSingleton {
    private static FullSingleton fullSingleton;       //指向自己实例的私有静态引用
    private FullSingleton(){}     //私有的构造方法
    public static FullSingleton getFullSingle(){       //以自己实例为返回值的静态的公有的方法
        if (fullSingleton == null){
            fullSingleton = new FullSingleton();      //实例化对象
        }
        return fullSingleton;
    }
}
