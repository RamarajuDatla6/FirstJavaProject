package com.my.programs;

class Aaa {
    void m1(Aaa a){
        System.out.println("m1 method in class A");
    }
}

class Bbb extends Aaa{
    public void m1(Aaa a) {
        System.out.println("m1 method in class B");
    }
}

public class PolymorMainChallenege {
    public static void main(String[] args) {
        Aaa a = new Aaa();
        a.m1(a);
        a.m1(new Bbb());
        Bbb b = new Bbb();
        b.m1(null);
        a = b;
        a.m1(null);
        a.m1(new Aaa());
    }
}
