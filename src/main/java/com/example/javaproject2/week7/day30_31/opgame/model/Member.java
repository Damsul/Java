package com.example.javaproject2.week7.day30_31.opgame.model;

public class Member {
    String id;
    boolean isLogined;

    public Member(String id, boolean isLogined) {
        this.id = id;
        this.isLogined = isLogined;
    }

    public String getId() {
        return id;
    }

    public boolean isLogined() {
        return isLogined;
    }
}
