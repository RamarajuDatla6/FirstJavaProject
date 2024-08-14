package com.my.programs;

public class Quadratic {
    public int a;
    public int b;
    public int c;
    public double d;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculat(int a,int b,int c){
        double d = (Math.pow(b,2)) - 4*a*c;
        return d;
    }

    public class Discriminant{
        public void cal(){
            double x1 = (-b+Math.sqrt(d)/2*a);
            double x2 = (-b-Math.sqrt(d)/2*a);
            System.out.println("The positive root is "+x1);
            System.out.println("The negative root is "+x2);
        }
    }
}
