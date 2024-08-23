package com.my.programs;

import java.util.Comparator;

public class MovieComparator implements Comparator<MovieComparator> {

    private double rating;
    private String name;
    private int year;

    public MovieComparator(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        return o1.year - o2.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
