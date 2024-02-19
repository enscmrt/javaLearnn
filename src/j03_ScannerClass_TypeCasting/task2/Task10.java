package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit giriniz: ");
        double fahrenheit = scanner.nextInt();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius " + celsius);


    }


}
