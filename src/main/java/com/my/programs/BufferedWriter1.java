package com.my.programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("writetext.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(1000);
        bw.newLine();
        bw.write("my name is raju");
        bw.newLine();
        String b = "my name is raju";
        bw.write(b,3,5);

        bw.close();
    }
}
