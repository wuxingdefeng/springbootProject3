package com.jueke.entity;

/**
 * Created by Administrator on 2018/3/8.
 * 返回参数格式
 */
public class ErrorInfo{

    //业务类型
    private String bizType;
    //业务代码
    private int bizCode;
    //错误信息
    private String message;
    //数据
    private Object data;

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public int getBizCode() {
        return bizCode;
    }

    public void setBizCode(int bizCode) {
        this.bizCode = bizCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
