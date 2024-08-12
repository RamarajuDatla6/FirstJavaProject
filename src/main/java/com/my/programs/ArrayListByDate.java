//Help Saransh in writing a java program to sort objects in array list by dates.

package com.my.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class DateItem{
    String date;

    public DateItem(String date) {
        this.date = date;
    }
}


class sortItem implements Comparator<DateItem> {
    public int compare (DateItem a, DateItem b){
        return a.date.compareTo(b.date);
    }
}

public class ArrayListByDate {
    public static void main(String[] args) {
        ArrayList<DateItem> dateList = new ArrayList<>();
        dateList.add(new DateItem("2020-03-25"));
        dateList.add(new DateItem("2019-01-27"));
        dateList.add(new DateItem("1998-01-27"));
        dateList.add(new DateItem("1998-02-26"));
        Collections.sort(dateList,new sortItem());
        System.out.println("Sorted in ascending order");
        for (DateItem d : dateList){
            System.out.println(d.date);
        }
    }
}
