package com.my.programs;

interface addable{
    public int add(int a,int b);
}

public class LambdaExpressions1 {
    public static void main(String[] args) {
        addable p = (a, b) -> (a + b);
        {
            System.out.println(p.add(10, 20));
            System.out.println(p.add(11, 12));
            System.out.println(p.add(2, 3));
        }
        ;

        addable q = (a, b) -> (a - b);
        {
            System.out.println(q.add(10, 20));
            System.out.println(q.add(11, 12));
            System.out.println(q.add(2, 3));


        }
    }
}
