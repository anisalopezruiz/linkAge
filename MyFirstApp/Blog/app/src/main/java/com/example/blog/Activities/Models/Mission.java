package com.example.blog.Activities.Models;

import com.google.firebase.database.ServerValue;

public class Mission {

    private String missionKey;
    private String title;
    private String location;
    private String date;
    private String time;
    private String people;
    private String description;
    private Object timeStamp;

    public Mission(String title, String location, String date, String time, String people, String description) {
        this.title = title;
        this.location = location;
        this.date = date;
        this.time = time;
        this.people = people;
        this.description = description;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    public Mission() {
    }

    public String getMissionKey() {
        return missionKey;
    }

    public void setMissionKey(String missionKey) {
        this.missionKey = missionKey;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getPeople() {
        return people;
    }

    public String getDescription() {
        return description;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }
}
