package com.mvp.jaki.responsivemode.base;

/**
 * 响应体基类
 * Created by jaki on 2018/4/13.
 */
public class BaseResponse<T> {
    //响应码
    private int code;

    //响应信息
    private String message;

    //这里的T有可能是实体类，也有可能是集合
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
