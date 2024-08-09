package com.my.programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,6,7,13,15,16,17,22,32};
        int key = 22;
        int result = searchKey(arr,key);
    }

    public static int searchKey(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int found = -1;

        while (low <= high){
            int mid = (low - high)/2;

            if( mid == key){
                found = 1;
            }

            if ()
        }
    }
}
