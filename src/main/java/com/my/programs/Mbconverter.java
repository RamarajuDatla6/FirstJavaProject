//Create a integer variable kiloBytes and take a input from the user in kiloBytes.
// Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.
//For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).

import java.util.Scanner;

public class Mbconverter {

    public static void printMegaBytes(int kilobytes) {

        if (kilobytes < 0) {
            System.out.println("Invalid");
        } else {
            int megabytes = kilobytes / 1024;
            System.out.println("the converted kb into mb is: " + megabytes);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilobytes = sc.nextInt();
        printMegaBytes(kilobytes);
    }
}
