package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz=");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz=");
        int sayi2 = scan.nextInt();
        int sayac =1;
        int ebob =1;
        while (sayac<=sayi1){
            if(sayi1%sayac==0&&sayi2%sayac==0){
                ebob=sayac;
            }

            sayac++;
        }
        int ekok =(sayi1*sayi2)/ebob;
        System.out.println("ebob = " + ebob);
        System.out.println("ekok = " + ekok);

    }
}
