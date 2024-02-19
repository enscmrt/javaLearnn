package j04_JavaOperators.j01_AritmeticOperators.task2;

import java.util.Scanner;

public class Task03 {

    public static <Scannner> void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz");
        int sayi = input.nextInt();
       // int birlerBas = sayi%10;
        //int yüzlerBas = sayi/100;
        //System.out.println("Toplam ="+(birlerBas+yüzlerBas));
        System.out.println("Toplam ="+(sayi%10+sayi/100));



    }

}
