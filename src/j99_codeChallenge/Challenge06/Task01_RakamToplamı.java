package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task01_RakamToplamı {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        int rakamToplam = 0;
        while (sayi>0){


            rakamToplam+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println("Girilen sayıların toplamı:"+rakamToplam);





    }// main sonu
}// Class sonu

