package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        int sayac =0;
        int bolenSayi= 1;
        while (bolenSayi<=sayi){
            if (sayi%bolenSayi==0){
                sayac++;
            }
            bolenSayi++;

        }
        System.out.println();
        System.out.println("girilen sayı: "+sayi+"nın"+sayac+"tane tam böleni var");

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                sayac++;
                System.out.print(i+" ");
            }

        }

    }
}
