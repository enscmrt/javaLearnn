package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();

        basamakSayisi(sayi);


    }

    private static void basamakSayisi(int sayi) {
        int sayac =0;
        while (sayi!=0){
            sayi = sayi/10;

            sayac++;
        }
        System.out.println("Basamak sayısı= "+sayac);
    }
}
