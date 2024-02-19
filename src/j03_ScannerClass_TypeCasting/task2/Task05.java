package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz = ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci bir tamsayı giriniz = ");
        int sayi2 = scanner.nextInt();
        int toplam = sayi1+sayi2;
        int fark = sayi1-sayi2;
        int çarp = sayi1*sayi2;
        double bölme = sayi1/sayi2;
        System.out.println("İki sayının toplamı = " + toplam);
        System.out.println("İki sayının farkı = " + fark);
        System.out.println("İki sayının çarpımı = " + çarp);
        System.out.println("İki sayının bölümü = " + bölme);





    }

}
