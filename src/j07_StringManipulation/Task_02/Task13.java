package j07_StringManipulation.Task_02;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen string giriniz");
        String string = scan.nextLine();
        System.out.println(string.replace(" ","").length());

    }
}
