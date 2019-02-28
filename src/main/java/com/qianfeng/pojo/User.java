package com.qianfeng.pojo;

public class User {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private String uPhone;

    private String uSex;

    private String uSignature;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuSignature() {
        return uSignature;
    }

    public void setuSignature(String uSignature) {
        this.uSignature = uSignature == null ? null : uSignature.trim();
    }
}