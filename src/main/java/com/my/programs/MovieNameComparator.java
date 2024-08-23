package com.my.programs;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<MovieComparator> {

    @Override
    public int compare(MovieComparator m1,MovieComparator m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
