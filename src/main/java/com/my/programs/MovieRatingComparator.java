package com.my.programs;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<MovieComparator> {

    @Override
    public int compare(MovieComparator m1, MovieComparator m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return -1;
        else return 0;
    }
}
