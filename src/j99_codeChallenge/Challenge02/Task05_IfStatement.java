package j99_codeChallenge.Challenge02;

import java.util.Scanner;

public class Task05_IfStatement {
    public static void main(String[] args) {
        /* Task->
 Girilen jobTitle data için : Eger jobTitle
 qa ise print "is unvaniniz Quality Analyst."
 dev ise print "is unvaniniz Developer."
 ba ise print "is unvaniniz Business Analyst."
 pm ise print "is unvaniniz Project Manager."
 print eden code create ediniz...
*/
        Scanner input = new Scanner(System.in);
        System.out.println("jobTitle girin:");
        String jobTitle = input.nextLine();
        if(jobTitle.equals("qa")){
            System.out.println("is unvaniniz Quality Analyst.");

        }else if(jobTitle.equals("dev")){
            System.out.println("is unvaniniz Developer.");

        }else if(jobTitle.equals("ba")){
            System.out.println("is unvaniniz Business Analyst.");

        }else if(jobTitle.equals("pm")){
            System.out.println("is unvaniniz Project Manager.");

        }else System.out.println("agam adam gibi bişey giresen:");
    }
}
