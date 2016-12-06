package com.java.model.domain;

public class FrontUser {
    /**
    
     */
    private Long id;

    /**
    
     */
    private String mobile;

    /**
    
     */
    private String password;

    /**
    normal(正常),delete(删除),freeze(冻结)
     */
    private String enabled;

    /**
    
     */
    private String note;

    /**
    
     */
    private Long userLasttime;

    /**
    
     */
    private String userLastip;

    /**
    第三方用户标识
     */
    private String thirdpartyCode;

    /**
    
     */
    private Byte loginNumber;

    /**
    
     */
    private Long loginWrongTime;

    /**
    
     */
    private String belongingTo;

    public Long getId() {
        return id;
    }

    public FrontUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public FrontUser setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FrontUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEnabled() {
        return enabled;
    }

    public FrontUser setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getNote() {
        return note;
    }

    public FrontUser setNote(String note) {
        this.note = note;
        return this;
    }

    public Long getUserLasttime() {
        return userLasttime;
    }

    public FrontUser setUserLasttime(Long userLasttime) {
        this.userLasttime = userLasttime;
        return this;
    }

    public String getUserLastip() {
        return userLastip;
    }

    public FrontUser setUserLastip(String userLastip) {
        this.userLastip = userLastip;
        return this;
    }

    public String getThirdpartyCode() {
        return thirdpartyCode;
    }

    public FrontUser setThirdpartyCode(String thirdpartyCode) {
        this.thirdpartyCode = thirdpartyCode;
        return this;
    }

    public Byte getLoginNumber() {
        return loginNumber;
    }

    public FrontUser setLoginNumber(Byte loginNumber) {
        this.loginNumber = loginNumber;
        return this;
    }

    public Long getLoginWrongTime() {
        return loginWrongTime;
    }

    public FrontUser setLoginWrongTime(Long loginWrongTime) {
        this.loginWrongTime = loginWrongTime;
        return this;
    }

    public String getBelongingTo() {
        return belongingTo;
    }

    public FrontUser setBelongingTo(String belongingTo) {
        this.belongingTo = belongingTo;
        return this;
    }

    @Override
    public String toString() {
        return "FrontUser{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", enabled='" + enabled + '\'' +
                ", note='" + note + '\'' +
                ", userLasttime=" + userLasttime +
                ", userLastip='" + userLastip + '\'' +
                ", thirdpartyCode='" + thirdpartyCode + '\'' +
                ", loginNumber=" + loginNumber +
                ", loginWrongTime=" + loginWrongTime +
                ", belongingTo='" + belongingTo + '\'' +
                '}';
    }
}