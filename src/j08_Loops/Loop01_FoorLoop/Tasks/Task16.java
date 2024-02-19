package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi = scan.nextInt();
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                System.out.println(sayi+" asal olmayan sayı");
                break;
            }else {
                System.out.println(sayi+" asal sayı");
            }
        }
        System.out.println();



    }
}
