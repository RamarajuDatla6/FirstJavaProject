package com.my.programs;

//class IntegerClass {
//    private int myIntValue ;
//                                                            // This is a wrapper class
//                                                            // we have wrapped int in the IntegerClass.
//                                                            //So we can use IntergerClass as int type in the ArrayList
//    public IntegerClass(int myIntValue) {
//        this.myIntValue = myIntValue;
//    }
//
//    public int getMyIntValue() {
//        return myIntValue;
//    }
//
//    public void setMyIntValue(int myIntValue) {
//        this.myIntValue = myIntValue;
//    }
//}

import java.util.ArrayList;

public class AutoboxUnbox {
    public static void main(String[] args) {
//        String[] stringArray = new String[10];
//        int[] intArray = new int[10];
//
//        ArrayList<String> stringArrayList = new ArrayList<>();
//       // ArrayList<int> intArrayList = new ArrayList<int>();  //primitive data types are not allowed in ArrayList
//        ArrayList<IntegerClass> intArrayList = new ArrayList<IntegerClass>();
//
//        intArrayList.add(new IntegerClass(18));
//
//        int myInt = 10;
//        Integer myInt1 = 10;
//

        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
        for (int i = 0;i <= 10;i++){
            myIntArrayList.add(Integer.valueOf(i));    // Autoboxing
        }

        for (int i = 0;i <= 10;i++){
            System.out.println(i + " is "+myIntArrayList.get(i).intValue());  // Unboxing
        }
    }
}
