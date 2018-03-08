package com.jueke.expection;

/**
 * Created by Administrator on 2018/3/8.
 */
public class BusinessException extends Exception {

    private static final  long serialVersionUID = 1L;

    //业务类型
    private String bizType;
    //业务代码
    private int bizCode;
    //错误信息
    private String message;
    //数据
    private Object data;

    public BusinessException(String message) {
        super(message);
        this.bizType = "0";
        this.bizCode = -1;
        this.message = message;
        this.data = data;
    }

    public BusinessException(String bizType, int bizCode, String message) {
        this.bizType = bizType;
        this.bizCode = bizCode;
        this.message = message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    @Override
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
