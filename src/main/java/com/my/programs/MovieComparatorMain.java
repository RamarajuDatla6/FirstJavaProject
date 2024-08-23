package com.my.programs;

import java.util.ArrayList;
import java.util.Collections;

public class MovieComparatorMain {
    public static void main(String[] args) {

        ArrayList<MovieComparator> list = new ArrayList<>();

        list.add(new MovieComparator(5.7,"sardar",2022));
        list.add(new MovieComparator(8.9,"bahubali",2014));
        list.add(new MovieComparator(9.1,"kgf",2020));
        list.add(new MovieComparator(9.0,"kalki",2024));

        System.out.println("sorted based on rating");

        MovieRatingComparator rating = new MovieRatingComparator();
        Collections.sort(list,rating);
        for(MovieComparator movie:list){
            System.out.println(movie.getRating()+" "+movie.getYear()+" "+movie.getName());
        }

        System.out.println("sorted based on Name");

        MovieNameComparator name = new MovieNameComparator();
        Collections.sort(list,name);
        for(MovieComparator movie:list){
            System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRating());
        }

        System.out.println("sorted based on Year");

        MovieYearComparator year = new MovieYearComparator();
        Collections.sort(list,year);
        for(MovieComparator movie:list){
            System.out.println(movie.getYear()+" "+movie.getName()+" "+movie.getRating());
        }
    }
}
