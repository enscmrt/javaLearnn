package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mid-term grade = ");
       double midTermGrade = scanner.nextDouble();
        System.out.println("Final grade = ");
        double finalGrade = scanner.nextDouble();
        System.out.println("Project grade = ");
        double projectGrade = scanner.nextDouble();
        System.out.println("Your grade is : " + (midTermGrade*0.3 + finalGrade*0.5 + projectGrade*0.2));



    }
}
