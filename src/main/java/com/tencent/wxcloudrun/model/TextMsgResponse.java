package com.tencent.wxcloudrun.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @Author: jinsong
 * @Date: 2023/9/4
 * @Description: 文本消息回复
 * 响应示例:
 * <xml>
 *   <ToUserName><![CDATA[toUser]]></ToUserName>
 *   <FromUserName><![CDATA[fromUser]]></FromUserName>
 *   <CreateTime>12345678</CreateTime>
 *   <MsgType><![CDATA[news]]></MsgType>
 *   <ArticleCount>1</ArticleCount>
 *   <Articles>
 *     <item>
 *       <Title><![CDATA[title1]]></Title>
 *       <Description><![CDATA[description1]]></Description>
 *       <PicUrl><![CDATA[picurl]]></PicUrl>
 *       <Url><![CDATA[url]]></Url>
 *     </item>
 *   </Articles>
 * </xml>
 */
@XmlRootElement(name ="xml")
public class TextMsgResponse implements Serializable {

    private static final long serialVersionUID = 1318437492488318824L;

    @XmlElement(name = "ToUserName")
    private String ToUserName;

    @XmlTransient
    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String ToUserName) {
        this.ToUserName = ToUserName;
    }

    // @XmlElement(name = "FromUserName")
    // @JSONField(name = "FromUserName")
    // private String fromUserName;
    //
    // @XmlElement(name = "CreateTime")
    // @JSONField(name = "CreateTime")
    // private Long createTime;
    //
    // @XmlElement(name = "MsgType")
    // @JSONField(name = "MsgType")
    // private String msgType;
    //
    // @XmlElement(name = "ArticleCount")
    // @JSONField(name = "ArticleCount")
    // private Integer articleCount;
    //
    // @XmlElement(name = "Articles")
    // @JSONField(name = "Articles")
    // private List<Article> articles;
    //
    // @Data
    // public static class Article implements Serializable{
    //
    //     private static final long serialVersionUID = 968010435565880286L;
    //
    //     @XmlElement(name = "Title")
    //     @JSONField(name = "Title")
    //     private String title;
    //
    //     @XmlElement(name = "Description")
    //     @JSONField(name = "Description")
    //     private String description;
    //
    //     @XmlElement(name = "PicUrl")
    //     @JSONField(name = "PicUrl")
    //     private String picUrl;
    //
    //     @XmlElement(name = "Url")
    //     @JSONField(name = "Url")
    //     private String url;
    // }
}
