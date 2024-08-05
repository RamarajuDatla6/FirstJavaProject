package com.my.programs;

public class Student {
    String firstName;
    String lastName;
    int marks;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getMarks(){
        return marks;
    }

    public void setFirstName( String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMarks(int marks){
        if (marks < 0 || marks > 100){
            this.marks = 0;
        } else{
            this.marks=marks;
        }
    }

    public boolean isPass(){
        if (marks >= 33 && marks <= 100){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName(){
        String first = firstName;
        String last = lastName;

        if(first.isEmpty() && last.isEmpty()){
            return "";
        } else if (first.isEmpty()) {
            return last;
        } else if (last.isEmpty()) {
            return first;
        } else{
            return first+" "+last;
        }
    }
}
