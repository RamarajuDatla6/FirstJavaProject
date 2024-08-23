package com.my.programs;

import java.util.Comparator;

public class MovieYearComparator implements Comparator<MovieComparator> {

    @Override
    public int compare(MovieComparator m1, MovieComparator m2) {
        if (m1.getYear() < m2.getYear()) return -1;
        if(m1.getYear() > m2.getYear())  return  1;
        else return 0;
    }
}
