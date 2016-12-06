package com.java.model.domain;

import java.util.Date;

public class UserVisit {
    /**
    
     */
    private Long id;

    /**
    
     */
    private String visitIp;

    /**
    
     */
    private String visitPage;

    /**
    
     */
    private String visitPageDesc;

    /**
    
     */
    private String visitSource;

    /**
    
     */
    private Date visitTime;

    public Long getId() {
        return id;
    }

    public UserVisit setId(Long id) {
        this.id = id;
        return this;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public UserVisit setVisitIp(String visitIp) {
        this.visitIp = visitIp;
        return this;
    }

    public String getVisitPage() {
        return visitPage;
    }

    public UserVisit setVisitPage(String visitPage) {
        this.visitPage = visitPage;
        return this;
    }

    public String getVisitPageDesc() {
        return visitPageDesc;
    }

    public UserVisit setVisitPageDesc(String visitPageDesc) {
        this.visitPageDesc = visitPageDesc;
        return this;
    }

    public String getVisitSource() {
        return visitSource;
    }

    public UserVisit setVisitSource(String visitSource) {
        this.visitSource = visitSource;
        return this;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public UserVisit setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
        return this;
    }

    @Override
    public String toString() {
        return "UserVisit{" +
                "id=" + id +
                ", visitIp='" + visitIp + '\'' +
                ", visitPage='" + visitPage + '\'' +
                ", visitPageDesc='" + visitPageDesc + '\'' +
                ", visitSource='" + visitSource + '\'' +
                ", visitTime=" + visitTime +
                '}';
    }
}