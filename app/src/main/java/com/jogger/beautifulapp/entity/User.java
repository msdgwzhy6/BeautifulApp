package com.jogger.beautifulapp.entity;


import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String userName;
    private String career;
    private String bg_color;
    private String avatar_url;
    private String identity;
    private String flowers;
    private int id;
    private String ename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getBg_color() {
        return bg_color;
    }

    public void setBg_color(String bg_color) {
        this.bg_color = bg_color;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", career='" + career + '\'' +
                ", bg_color='" + bg_color + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", identity='" + identity + '\'' +
                ", flowers='" + flowers + '\'' +
                ", id=" + id +
                ", ename='" + ename + '\'' +
                '}';
    }
}
