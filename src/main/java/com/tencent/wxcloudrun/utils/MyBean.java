package com.tencent.wxcloudrun.utils;

import java.io.Serializable;
import java.util.Vector;

/**
 * @Author: LinJiaRui.霖嘉睿
 * @Date: 2023/9/4
 * @Description:
 */
public class MyBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean myBoolean;
    private String myString;
    private Vector<String> myVector;

    public MyBean() {
    }
    public boolean isMyBoolean() {
        return myBoolean;
    }
    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }
    public String getMyString() {
        return myString;
    }
    public void setMyString(String myString) {
        this.myString = myString;
    }
    public Vector<String> getMyVector() {
        return myVector;
    }
    public void setMyVector(Vector<String> myVector) {
        this.myVector = myVector;
    }
}
