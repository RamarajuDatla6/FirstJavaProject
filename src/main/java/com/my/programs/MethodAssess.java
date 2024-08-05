//Declare a string variable student_name and a int variable student_score.
// calculate student division by using student_score variable.
//Student division can be calculated as :
//if student_score>=80, print "A" division
//else if student_score >=60 and <80, print "B" division
//else if student_score>=40 and <60, print "C" division
//else if student_score<40, print "F" division.


public class MethodAssess {
    public static void main(String[] args) {
        String student_name = "Vijay";
        int student_score = 85;
        int grade = studentDivision(student_score);

    }

    public static int studentDivision(int marks) {
        if (marks >= 80) {
            System.out.println("A division");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("B division");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("C division");
        } else if (marks < 40) {
            System.out.println("F division");
        }
        return 0;
    }

}
