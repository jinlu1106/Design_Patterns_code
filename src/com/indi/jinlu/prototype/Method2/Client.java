package com.indi.jinlu.prototype.Method2;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype obj1 = new ConcretePrototype();
        obj1.setI(1);
        obj1.setDate("第11周");
        obj1.setName("张三");
        obj1.setThing("周末加班！");

        System.out.println("*******周记一*******");
        System.out.println("姓名：" + obj1.getName());
        System.out.println("数字：" + obj1.getI());
        System.out.println("日期：" + obj1.getDate());
        System.out.println("事件：" + obj1.getThing());

        ConcretePrototype obj2 = obj1.clone();
        obj2.setDate("第12周");
        System.out.println("*******周记二*******");
        System.out.println("数字：" + obj2.getI());
        System.out.println("姓名：" + obj2.getName());
        System.out.println("日期：" + obj2.getDate());
        System.out.println("事件：" + obj2.getThing());


        System.out.println(obj1.equals(obj2));
        System.out.println(obj1 == obj2);
        System.out.println(obj1.getDate()==obj2.getDate());
        System.out.println(obj1.getName()==obj2.getName());
        System.out.println(obj1.getThing()==obj2.getThing());
        System.out.println(obj1.getI()==obj2.getI());
    }

}
