package com.indi.jinlu.FactoryMethod;
//创建product2对象的工厂实现
public class FactoryMethod2 implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product2();
    }
}
