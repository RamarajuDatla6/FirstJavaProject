package com.my.programs;

public class HashCodeAndEquals {
    public static void main(String[] args) {

        HashCodeAndEqualsStudent S1 = new HashCodeAndEqualsStudent("A","1");
        HashCodeAndEqualsStudent S2 = new HashCodeAndEqualsStudent("A","1");
        HashCodeAndEqualsStudent S3 = new HashCodeAndEqualsStudent("B","2");
        HashCodeAndEqualsStudent S4 = S1;
        HashCodeAndEqualsStudent S5 = S4;

        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S4));
        System.out.println(S1.equals(S5));

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println(S3.hashCode());
        System.out.println(S4.hashCode());
        System.out.println(S5.hashCode());

    }
}
