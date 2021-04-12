package com.example.blog.Activities.Models;

import com.google.firebase.database.ServerValue;

public class MissionExtraInfo {

    private String missionExtraKey;
    private String reward;
    private String hour;
    private String minute;
    private String every;
    private String repetition;
    private String picture;
    private String userId;
    private String userPhoto;
    private Object timeStamp;

    public MissionExtraInfo(String reward, String hour, String minute, String every, String repetition, String picture, String userId, String userPhoto) {
        this.reward = reward;
        this.hour = hour;
        this.minute = minute;
        this.every = every;
        this.repetition = repetition;
        this.picture = picture;
        this.userId = userId;
        this.userPhoto = userPhoto;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    public MissionExtraInfo() {
    }

    public String getMissionExtraKey() {
        return missionExtraKey;
    }

    public void setMissionExtraKey(String missionExtraKey) {
        this.missionExtraKey = missionExtraKey;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getEvery() {
        return every;
    }

    public void setEvery(String every) {
        this.every = every;
    }

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }
}
