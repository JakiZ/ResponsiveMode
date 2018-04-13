package com.mvp.jaki.responsivemode.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jaki on 2018/4/13.
 */

public class UserBean {
    private String key;
    private String phone;
    private String name;
    @SerializedName(value = "passwd")
    private String password;
    private String text;
    private String img;
    private String other;
    private String other2;
    private String createTime;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "key='" + key + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", text='" + text + '\'' +
                ", img='" + img + '\'' +
                ", other='" + other + '\'' +
                ", other2='" + other2 + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
