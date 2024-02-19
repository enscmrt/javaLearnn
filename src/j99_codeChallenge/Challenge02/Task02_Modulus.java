package j99_codeChallenge.Challenge02;

import java.util.Scanner;

public class Task02_Modulus {
    public static void main(String[] args) {
        /* Task->
         *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
         *
         *   Ex :
         *   input  : 14531
         *   output : 9
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Beş basamaklı bir sayı giriniz");
        int sayi=scanner.nextInt();
        int ilkikiSayi = sayi/1000;
        int sonikiSayi = sayi%100;
        System.out.println("girilen sayının ilk ve son iki rakam toplamı= "+(ilkikiSayi%10+ilkikiSayi/10+sonikiSayi%10+sonikiSayi/10));
    }
}
