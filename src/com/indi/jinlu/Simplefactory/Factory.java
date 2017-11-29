package com.indi.jinlu.Simplefactory;
//工厂类----决定如何实例化产品
public class Factory {
    //静态工厂方法
    public static BMW createBMW(String type){
        if (type.equals("BMW320")){
            return new BMW320();
        }else if (type.equals("BMW523")){
            return new BMW523();
        }else{
            return null;
        }
    }
}
