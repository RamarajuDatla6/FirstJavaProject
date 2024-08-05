public class Metho {
    public static void main(String[] args) {
        String studentname = "Vijay";
        int studentmarks = 81;
        char studgrad = gradeCalculator(studentmarks);
        displayDetails(studentname, studgrad);
    }

    public static char gradeCalculator(int marks) {
        char Grade;

        if (marks > 90 && marks <= 100) {
            Grade = 'S';
        } else if (marks > 80 && marks <= 90) {
            Grade = 'A';
        } else if (marks > 70 && marks <= 80) {
            Grade = 'B';
        } else Grade = 'F';
        return Grade;
    }

    public static void displayDetails(String Name, char studentgrade) {
        System.out.println("student name is " + Name + " And the grade is " + studentgrade);

    }
}
