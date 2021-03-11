package com.test.testweb.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="myrecord")
public class Records {

    private Integer recordId;
    private String title;
    private String scheme;
    private char status;


    public Records() {
    }

    public Records(Integer recordId, String title, String scheme, char status) {
        this.recordId = recordId;
        this.title = title;
        this.scheme = scheme;
        this.status = status;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return "Records{" +
                "recordId=" + recordId +
                ", title='" + title + '\'' +
                ", scheme='" + scheme + '\'' +
                ", status=" + status +
                '}';
    }
}
