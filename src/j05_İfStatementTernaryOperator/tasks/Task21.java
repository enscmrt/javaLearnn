package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        int sonBasamak = sayi % 10;

        System.out.println(sonBasamak>=5 ? sayi+(10- sonBasamak):(sayi-sonBasamak));




    }

}
