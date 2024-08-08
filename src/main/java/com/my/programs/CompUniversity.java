package com.my.programs;

public class CompUniversity {
    private String name;
    private CompCollege college;

    public CompUniversity(String name, CompCollege college) {
        this.name = name;
        this.college = college;
    }

    public CompCollege getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

}
