package com.my.programs;

public class CompLibrary {
    private String name;
    private String yearOfBuild;
    private int noOfBooks;
    private CompFloor floor;

    public CompLibrary(String name, String yearOfBuild, int noOfBooks, CompFloor floor) {
        this.name = name;
        this.yearOfBuild = yearOfBuild;
        this.noOfBooks = noOfBooks;
        this.floor = floor;
    }

    public String getName(){
        return name;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public String getYearOfBuild() {
        return yearOfBuild;
    }

    public CompFloor getFloor() {
        return floor;
    }

    public void searchABook(){
        System.out.println("Searching for Book");
    }
}
