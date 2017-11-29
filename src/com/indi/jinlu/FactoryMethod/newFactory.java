package com.indi.jinlu.FactoryMethod;

abstract class newFactory {
    //在工厂类里面直接调用产品类的业务方法create()
    public void create(){
        IProduct iProduct = this.createProduct1();
        iProduct.create();
    }
    abstract IProduct createProduct1();
}
