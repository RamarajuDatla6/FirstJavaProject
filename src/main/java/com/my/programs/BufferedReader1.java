package com.my.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\dsavr\\OneDrive\\Desktop\\Projects\\FirstJavaProject\\src\\main\\java\\Raghu.txt");
        BufferedReader br = new BufferedReader(fr);

//        String line = br.readLine();
//        while (line != null){
//            System.out.println(line);
//            line = br.readLine();
//        }

        String[] intStr = br.readLine().split(" ");
        int[] a = new int[intStr.length];

        for (int i = 0;i < intStr.length;i++){
            a[i] = Integer.parseInt(intStr[i]);

        }

        int sum = a[0] + a[3];
        System.out.println(sum);

        br.close();
    }
}
