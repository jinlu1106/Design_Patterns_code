package com.indi.jinlu.prototype.Method2;

import java.io.*;

public class DeepAttachment implements Serializable {       //继承Serializable接口实现序列化
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，文件名为：" + name);
    }
}
