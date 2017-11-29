package com.indi.jinlu.Simplefactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取product的类型，并返回类型名
    public static String getBMWType(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("configuration/config.xml"));

            //获取包含BMW类型的文本节点
            NodeList n1 = doc.getElementsByTagName("BMWType");
            Node classNode = n1.item(0).getFirstChild();
            String BMWType = classNode.getNodeValue().trim();      //trim()方法为String类的一个方法，可以去掉文本节点前后的空格
            return BMWType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
