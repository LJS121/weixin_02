package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: jinsong
 * @Date: 2023/9/4
 */
@RestController
@RequestMapping
@Slf4j
public class FansController {

    @PostMapping("/fans/msg")
    public String fansMsgPush(String msg) {
        log.info("fans_push_msg={}", JSON.toJSONString(msg));
        return "<xml>\n"
            + "  <ToUserName><![CDATA[toUser]]></ToUserName>\n"
            + "  <FromUserName><![CDATA[fromUser]]></FromUserName>\n"
            + "  <CreateTime>12345678</CreateTime>\n"
            + "  <MsgType><![CDATA[news]]></MsgType>\n"
            + "  <ArticleCount>1</ArticleCount>\n"
            + "  <Articles>\n"
            + "    <item>\n"
            + "      <Title><![CDATA[title1]]></Title>\n"
            + "      <Description><![CDATA[description1]]></Description>\n"
            + "      <PicUrl><![CDATA[picurl]]></PicUrl>\n"
            + "      <Url><![CDATA[url]]></Url>\n"
            + "    </item>\n"
            + "  </Articles>\n"
            + "</xml>";
    }
}
