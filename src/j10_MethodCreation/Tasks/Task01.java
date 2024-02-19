package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz


        esitMi();


    }//main sonu

    private static boolean esitMi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2 = scan.nextInt();
        if (sayi1 == sayi2) {
            System.out.println(sayi1 + "=" + sayi2);
        } else {
            System.out.println("Sayılar eşit değildir");


        }

        return false;
    }
}//class sonu