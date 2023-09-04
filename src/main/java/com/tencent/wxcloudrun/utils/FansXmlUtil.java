package com.tencent.wxcloudrun.utils;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Vector;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.tencent.wxcloudrun.model.TextMsgResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: LinJiaRui.霖嘉睿
 * @Date: 2023/9/4
 * @Description: xml工具类
 */
@Slf4j
public class FansXmlUtil {
    public static String getFansXmlResponse (TextMsgResponse response) {
        return null;
    }

    /**
     * 将对象转为对应的xml报文
     *
     * @param object 对象
     * @param classT 类
     * @return xml
     * @throws JAXBException ex
     */
    public static String objectToXml(Object object, Class<?>... classT) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(classT);
        Marshaller marshaller = context.createMarshaller();
        //设置编码格式
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
        marshaller.marshal(object, writer);
        return new String(writer.getBuffer());
    }

    /**
     * 将xml报文转换为对象
     *
     * @param clazz  clazz
     * @param xmlStr xml
     * @return object
     */
    public static Object xmlToObject(String xmlStr, Class<?>... clazz) {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader sr = new StringReader(xmlStr);
            xmlObject = unmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            log.error("xmlStrToObject error:", e);
        }
        return xmlObject;
    }

    public static void main(String[] args) throws Exception {

        MyBean mb = new MyBean();
        mb.setMyBoolean(true);
        mb.setMyString("xml is cool");
        Vector<String> v = new Vector<String>();
        v.add("one");
        v.add("two");
        v.add("three");
        mb.setMyVector(v);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        XMLEncoder xmlEncoder = new XMLEncoder(baos);
        xmlEncoder.writeObject(mb);
        xmlEncoder.close();

        String xml = baos.toString();
        System.out.println(xml);

    }

}
