package com.my.programs;

public class QuadInner {
    public static void main(String[] args) {
        Quadratic qc = new Quadratic(2,5,3);
        Quadratic.Discriminant dc = qc.new Discriminant();
        dc.cal();
    }
}
