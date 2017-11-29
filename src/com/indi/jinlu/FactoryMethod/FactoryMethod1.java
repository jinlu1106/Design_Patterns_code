package com.indi.jinlu.FactoryMethod;

import com.indi.jinlu.FactoryMethod.IFactory;
import com.indi.jinlu.FactoryMethod.IProduct;
import com.indi.jinlu.FactoryMethod.Product1;

//创建product1对象的工厂实现
public class FactoryMethod1 extends newFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product1();
    }

    @Override
    IProduct createProduct1() {
        return new Product1();
    }


//    @Override
//    public List<IProduct> createProduct() {
//        List <IProduct> list = new ArrayList<>();
//        IProduct iProduct = new Product1();
//        IProduct iProduct1 = new Product2();
//        list.add(iProduct);
//        list.add(iProduct1);
//        return list;
//    }

}
