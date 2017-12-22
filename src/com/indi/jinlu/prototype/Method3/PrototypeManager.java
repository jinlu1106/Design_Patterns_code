package com.indi.jinlu.prototype.Method3;

import java.util.Hashtable;

//原型管理器
public class PrototypeManager {
    private Hashtable ht = new Hashtable();//用于存储原型对象
    private static PrototypeManager pt = new PrototypeManager();

    //为Hashtable增加公文对象
    private PrototypeManager(){
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }

    //增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc){
        ht.put(key,doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager(){
        return pt;
    }
}
