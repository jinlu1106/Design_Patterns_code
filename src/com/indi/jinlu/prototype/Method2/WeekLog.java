package com.indi.jinlu.prototype.Method2;

import java.io.*;

public class WeekLog implements Cloneable,Serializable {        //可克隆，可序列化
    private DeepAttachment deepAttachment;

    public DeepAttachment getDeepAttachment() {
        return deepAttachment;
    }

    public void setDeepAttachment(DeepAttachment deepAttachment) {
        this.deepAttachment = deepAttachment;
    }

//    private Attachment attachment;
    private String name;
    private String date;
    private String content;

//    public Attachment getAttachment() {
//        return attachment;
//    }
//
//    public void setAttachment(Attachment attachment) {
//        this.attachment = attachment;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //浅克隆
    public WeekLog clone(){
        Object object = null;
        try {
            object = super.clone();
            return (WeekLog) object;
        } catch (CloneNotSupportedException e) {
            System.err.println("不支持复制！");
            return null;
        }
    }

    //使用序列化实现深克隆
    public WeekLog deepClone() throws IOException, ClassNotFoundException {
        //将对象写入输入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream obj = new ObjectOutputStream(bao);
        obj.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeekLog) ois.readObject();
    }
}
