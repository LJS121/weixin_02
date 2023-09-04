package com.tencent.wxcloudrun.utils;

import org.w3c.dom.Document;

import cn.hutool.core.util.XmlUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: LinJiaRui.霖嘉睿
 * @Date: 2023/9/4
 * @Description: xml工具类
 */
@Slf4j
public class FansXmlUtil {

    public static void main(String[] args) {
        Document xml = XmlUtil.createXml("xml");
        System.out.println();
    }
}
