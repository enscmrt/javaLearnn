package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();//1453
        System.out.println("   ***   for loop   ***   ");
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                // System.out.println("girilen sayı ASAL değil :(");
                break;
            }
            // System.out.println("girilen sayı ASAL  :) ");

        }
        System.out.println(asalMi ? "girilen sayı ASAL  :) " : "girilen sayı ASAL değil :(");
        System.out.println("   ***   while loop   ***   ");
        int bolen = 2;
        while (sayi > bolen) {// sayı,,,,2 tekrar tanımlandı
            if (sayi % bolen == 0) {
                asalMi = false;
                bolen++;
                break;

            }
        }
        System.out.println(asalMi ? "girilen sayı ASAL  :) " : "girilen sayı ASAL değil :(");


    }


}
