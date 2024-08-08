package com.my.programs;

public class Sessions {
    String sessionName;
    CompStudent student;

    public Sessions(String sessionName, CompStudent student) {
        this.sessionName = sessionName;
        this.student = student;
    }

    public String getSessionName() {
        return sessionName;
    }

    public CompStudent getStudent() {
        return student;
    }
}
