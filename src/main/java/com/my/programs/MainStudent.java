// Write a class with the name Student. The class needs three fields (instance variables)
// with the names firstName, lastName of type String and marks of type int.
//
//Write the following methods (instance methods):
//
//Method named getFirstName without any parameters, it needs to return the value of the firstName field.
//Method named getLastName without any parameters, it needs to return the value of the lastName field.
//Method named getMarks without any parameters, it needs to return the value of the marks field.

//Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
//Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
//Method named setMarks with one parameter of type int, it needs to set the value of the marks field.

// If the parameter is less than 0 or greater than 100, it needs to set the marks field value to 0.
//Method named isPass without any parameters,
// it needs to return true if the value of the marks field is greater than or equal to 33 and less than or equal to 100, otherwise, return false.

//Method named getFullName without any parameters, it needs to return the full name of the person.   '
//In case both firstName and lastName fields are empty, Strings return an empty String.
//In case lastName is an empty String, return firstName.
//
//In case firstName is an empty String, return lastName.
package com.my.programs;

public class MainStudent {
    public static void main(String[]args){
        Student student = new Student ();
        student.setFirstName ("");	// firstName is set to empty string
        student.setLastName ("");	// lastName is set to empty string
        student.setMarks (10);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setFirstName ("Sudhir");	// firstName is set to Sudhir
        student.setMarks (80);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setLastName ("Dhangar");	// lastName is set to Dhangar
        System.out.println ("fullName= " + student.getFullName ());
    }
}
