package com.indi.jinlu.AbstractFactory;
//客户类
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
