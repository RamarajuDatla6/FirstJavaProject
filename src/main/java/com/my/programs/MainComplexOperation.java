//A complex number is a number that can be expressed in the form a+bi, where a and b are real numbers, and i is a solution of equation x2=-1.
//
//Write a program to Add and subtract  two complex numbers by creating a class Complex number in which :
//
//The complex numbers will be initialized with the help of the constructor.
//The addition and subtraction will be performed with the help of function calling.
//        Example :
//
//Input : a1= 4 b1=8 a2=5 b2=7
//
//Output : Sum = 9+ i15 Difference = -1+i

package com.my.programs;

public class MainComplexOperation {
    public static void main (String[]args){
        ComplexOperation c1 = new ComplexOperation(4,8);
        c1.printComplexNumber();

        ComplexOperation c2 = new ComplexOperation(5,7);
        c2.printComplexNumber();

        ComplexOperation c3 = new ComplexOperation();
        c3 = c3.addition(c1,c2);
        c3.printComplexNumber();

        ComplexOperation c4 = new ComplexOperation();
        c4 = c4.subtract(c1,c2);
        c4.printComplexNumber();
    }
}
