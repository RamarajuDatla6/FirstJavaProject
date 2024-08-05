//We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen.
// Given 3 int values, return true if none of them are teen, otherwise return false..

//Sample Input 1 :
//13 12 20

//Sample Output 1:
//False

//Explanation:
//Since 13 is a teen number, hence false is returned.

package com.my.programs;

import java.util.Scanner;

public class Teen {
    public static boolean teenCheck(int val1,int val2,int val3){
        if (val1 >= 13 && val1 <=19)
            return false;
        else if (val2 >= 13 && val1 <=19)
            return false;
        else if (val3 >=13 && val3 <=19)
            return false;
        else
            return true;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        boolean check = teenCheck(val1, val2, val3);
        System.out.println(check);
    }
}
