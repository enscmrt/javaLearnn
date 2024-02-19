package j07_StringManipulation.Task_02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz:");
        String metin = scan.nextLine();
        if(metin.contains(" ")){
            System.out.println("Boşluk karakteri var");

        }else
            System.out.println("Boşluk karakteri yok");


    }
}

