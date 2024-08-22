package com.my.programs;

public class ScopeOfVariable {

    public int publicVariable = 5;
    private int outerClassVariable = 1;


    public void checkingScope(){
        System.out.println("The public variable is "+ publicVariable);
        System.out.println("The private variable is "+outerClassVariable);
    }

    public int getouterClassVariable(){
        return outerClassVariable;
    }
//    public void setPrivateVariable(){
//        privateVariable = 4;
//    }

    public void multipier(){
        int privateVariable = 3;
        for (int i = 0;i < 5;i++){
            System.out.println(i+" multiplied by "+this.outerClassVariable+" is "+(i*this.outerClassVariable));
        }
    }


    public void accessingInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("The variable is : "+innerClass.innerVariable);
    }


    public class InnerClass{
        private int innerVariable = 7;

        public int getInnerVariable() {
            return innerVariable;
        }

        public void innerClassMethod(){
            System.out.println("This is from inner class.And the value for private variable is : "+innerVariable);
        }
        public void multipier(){
            int privateVariable = 9;
           // ScopeOfVariable.this.setPrivateVariable();
            for (int i = 0;i < 5;i++){
                System.out.println(i+" multiplied by "+ ScopeOfVariable.this.outerClassVariable+" is "+(i*ScopeOfVariable.this.outerClassVariable));
            }
        }
    }
}
