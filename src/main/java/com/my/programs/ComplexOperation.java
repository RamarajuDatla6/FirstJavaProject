package com.my.programs;

public class ComplexOperation {
    int real;
    private int imaginary;

    ComplexOperation(){
    }

    ComplexOperation( int tempReal, int tempImaginary){
        real = tempReal;
        imaginary = tempImaginary;
    }

    ComplexOperation addition ( ComplexOperation c1,ComplexOperation c2){
        ComplexOperation temp = new ComplexOperation();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    ComplexOperation subtract (ComplexOperation c1, ComplexOperation c2){
        ComplexOperation temp1 = new ComplexOperation();
        temp1.real = c1.real - c2.real;
        temp1.imaginary = c1.imaginary - c2.imaginary;
        return temp1;
    }

    void printComplexNumber(){
        System.out.println(" Complex number: "+ real + " + "+ imaginary+"i");
    }


}
