package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;
        while (toplam<=333){
            System.out.println("Lütfen bir sayı giriniz:");
            int sayi = sc.nextInt();
            toplam += sayi;
            sayac++;
            if (toplam>333){
                System.out.println("Toplam " + sayac + " adet sayı girdiniz.");
                System.out.println("Girilen sayıların toplamı: " + toplam);
            }

        }





    }
}
