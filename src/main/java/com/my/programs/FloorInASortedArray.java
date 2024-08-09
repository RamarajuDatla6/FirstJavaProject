//Given a sorted array and a value x, the floor of x is the largest element in array smaller than or equal to x.
//Write efficient functions to find floor of x.
//Input :  arr= {1, 2, 8, 10, 10, 12, 19}, x = 5 Output : 2
//
//
package com.my.programs;

public class FloorInASortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int x = 5;
        int result = findfloor(arr,x);
        System.out.println("the floor of "+x+" is: "+result);
    }

    public static int findfloor(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int floor = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if (arr[mid] <= x){
                floor = arr[mid];
                low = mid  + 1;
            }else {
                high = mid - 1;
            }
        }
        return floor;
    }
}
