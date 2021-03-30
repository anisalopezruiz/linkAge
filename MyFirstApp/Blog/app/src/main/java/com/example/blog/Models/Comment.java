package com.example.blog.Models;

import com.google.firebase.database.ServerValue;

public class Comment {

    private String context,uid,uimg,uname;
    private Object timestamp;


    public Comment() {
    }

    public Comment(String context, String uid, String uimg, String uname) {
        this.context = context;
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.timestamp = ServerValue.TIMESTAMP;


    }

    public Comment(String context, String uid, String uimg, String uname, Object timestamp) {
        this.context = context;
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.timestamp = timestamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }
}
