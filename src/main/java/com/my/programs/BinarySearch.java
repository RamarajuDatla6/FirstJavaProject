package com.my.programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,6,7,13,15,16,17,22,32};
        int key = 22;
        int result = searchKey(arr,key);
        System.out.println("Key is found at the index "+result);
    }

    public static int searchKey(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int found = -1;

        while (low <= high){
            int mid = low+(high-low)/2;

            if( arr[mid] == key){
                found = mid;
              //  break;
            }
            if (arr[mid] < key){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        if (found == -1){
            System.out.println("Element not found");
        }
        return found;
    }
}