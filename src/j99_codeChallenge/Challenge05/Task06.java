package j99_codeChallenge.Challenge05;

import java.util.Scanner;

public class Task06 {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String giriniz:");
        String str = input.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }




    }

}
