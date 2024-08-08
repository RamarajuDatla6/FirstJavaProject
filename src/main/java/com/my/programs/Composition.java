package com.my.programs;

public class Composition {
    public static void main(String[]a) {
        CompStudent student1 = new CompStudent("Vijay","#123");

        Sessions finalYear = new Sessions("2021",student1);

        CompFloor thirdFloor = new CompFloor(3,10000);

        CompBranch cse = new CompBranch("Computers",new Sessions("Pre Final Year",new CompStudent("Raju","#890")));

        CompLibrary krc = new CompLibrary("Krc","1980",76887,thirdFloor);

        CompCollege gitamVskp = new CompCollege("Gitam",krc,cse);

        CompUniversity gitam = new CompUniversity("GITAM UNIVERSITY",gitamVskp);

        gitam.getCollege().OpeningDate();
        gitam.getCollege().getLibrary().searchABook();
        gitam.getCollege().getLibrary().getFloor().cleanThefloor();;
    }

}
