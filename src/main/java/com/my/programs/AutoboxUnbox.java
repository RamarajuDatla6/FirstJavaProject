package com.my.programs;

import java.util.ArrayList;

class IntegerClass {
    private int myIntValue ;
                                                            // This is a wrapper class
                                                            // we have wrapped int in the IntegerClass.
                                                            //So we can use IntergerClass as int type in the ArrayList
    public IntegerClass(int myIntValue) {
        this.myIntValue = myIntValue;
    }

    public int getMyIntValue() {
        return myIntValue;
    }

    public void setMyIntValue(int myIntValue) {
        this.myIntValue = myIntValue;
    }
}

public class AutoboxUnbox {
    public static void main(String[] args) {
        String[] stringArray = new String[];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
       // ArrayList<int> intArrayList = new ArrayList<int>();  //primitive data types are not allowed in ArrayList
        ArrayList<IntegerClass> intArrayList = new ArrayList<IntegerClass>();

        intArrayList.add(new IntegerClass(18));

        int myInt = 10;
        Integer myInt1 = 10;
    }
}
