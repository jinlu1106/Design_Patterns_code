package com.indi.jinlu.prototype.Method1;

public class Client {
    public static void main(String[] args) {
        Prototype obj1 = new ConcretePrototype();
        obj1.setAttr("孙悟空");
        System.out.println(obj1.getAttr());
        Prototype obj2 = obj1.clone();
        obj2.setAttr("猪八戒");
        System.out.println(obj2.getAttr());
    }
}
