package com.my.programs;

public class MainScopeOfVariable {
    public static void main(String[] args) {

        int privateVariable = 10;

        ScopeOfVariable scopeCheck = new ScopeOfVariable();
        //scopeCheck.checkingScope();
        //System.out.println("the private var is : "+scopeCheck.getPrivateVariable());
        //System.out.println("the private var is "+privateVariable);
       //scopeCheck.multipier();

        //ScopeOfVariable.InnerClass innerclass = scopeCheck.new InnerClass();
       // innerclass.multipier();

        ScopeOfVariable.InnerClass innerClass = scopeCheck.new InnerClass();
        scopeCheck.accessingInner();


        System.out.println("The variable here is : "+innerClass.getInnerVariable());

    }
}
