package com.tencent.wxcloudrun.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * @Author: jinsong
 * @Date: 2023/9/4
 */
@Data
public class FansMsg implements Serializable {

    private static final long serialVersionUID = -2846257850995149424L;

    @JSONField(name = "ToUserName")
    private String toUserName;

    @JSONField(name = "FromUserName")
    private String fromUserName;

    @JSONField(name = "CreateTime")
    private Long createTime;

    @JSONField(name = "MsgType")
    private String msgType;

    @JSONField(name = "Content")
    private String content;

    @JSONField(name = "MsgId")
    private Long msgId;
}
