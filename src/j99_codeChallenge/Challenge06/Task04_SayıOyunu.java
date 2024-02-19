package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->vGirilen sayıların toplamını print eden ve girilen sayı toplamı 100'den buyuk ise
    girilen sayı adetini print eden code create ediniz.
     */

    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        int sayiToplam = 0;
        int sayiAdedi = 0;

        for (int i = 1; i <100 ; i++) {
            System.out.println(i+". sayıyı giriniz: ");
            int sayi = input.nextInt();
            sayiToplam+=sayi;
            sayiAdedi++;
            if(sayiToplam>100){
                System.out.println("sayiAdedi = " + sayiAdedi);
                System.out.println("sayiToplam = " + sayiToplam);
                break;
            }
        }*/

        Scanner input = new Scanner(System.in);

        int sayiToplam = 0;
        int sayiAdedi = 0;
        while (sayiToplam<=100) {
            System.out.println("Lütfen bir sayı giriniz: ");
            int sayi = input.nextInt();
            sayiToplam += sayi;
            sayiAdedi++;

            if (sayiToplam > 100) {
                System.out.println("sayiToplam = " + sayiToplam);
                System.out.println("sayiAdedi = " + sayiAdedi);
                break;

            }
        }





    }

}
