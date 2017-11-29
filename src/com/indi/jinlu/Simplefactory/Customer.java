package com.indi.jinlu.Simplefactory;
//客户类
public class Customer {
    public static void main(String[] args) {
//        BMW bmw;
//        bmw = Factory.createBMW(320);
//        bmw.show();
        BMW bmw;
        String type = XMLUtil.getBMWType();     //读取配置文件中的参数
        bmw = Factory.createBMW(type);
        bmw.show();
    }
}
