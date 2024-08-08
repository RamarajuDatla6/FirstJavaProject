package com.my.programs;

public class CompCollege {
    String collegeName;
    CompLibrary library;
    CompBranch branch;

    public CompCollege(String collegeName, CompLibrary library, CompBranch branch) {
        this.collegeName = collegeName;
        this.library = library;
        this.branch = branch;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public CompLibrary getLibrary() {
        return library;
    }

    public CompBranch getBranch() {
        return branch;
    }

    public void OpeningDate(){
        System.out.println("The Opening date is 20th JAN");
    }
}
