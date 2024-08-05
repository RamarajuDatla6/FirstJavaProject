package com.my.programs;

public class StudInfo {
    private String name;
    private int rollNo;
    private String standard;
    private String section;

    public String getName(){
        return name;
    }

    public String getStandard(){
        return standard;
    }

    public int getRollNo(){
        return  rollNo;
    }

    public String getSection(){
        return section;
    }

    public StudInfo(String name,int rollNo,String standard,String section){
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
        this.section = section;
    }

    public StudInfo(){
        this("Name",00,"00","A");
    }

    public StudInfo(String name,int rollNo){
        this(name,rollNo,"4","B");
    }


}
