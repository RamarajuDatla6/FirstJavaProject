//Declare a double variable weightKgs and take input from the user in kilograms.
//Also, Create a method convert(double kgs) and convert the weight to grams and milligrams.

import java.util.Scanner;

public class Weightcal {
    public static void mains(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        double weightKgs = sc.nextDouble();
        convert(weightKgs);
    }

    public static void convert(double kgs) {
        double wgms, wmgms;
        wgms = kgs * 1000;
        wmgms = wgms * 1000;
        System.out.println("the converetd weight in grams : " + wgms);
        System.out.println("the converted weight in milligrams : " + wgms);
    }
}
