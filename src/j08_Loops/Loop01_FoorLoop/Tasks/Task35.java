package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(16);
    }

    public static void fibonaccidenSayiYazdir(int adet) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet fibonacci serisi yazdırmak istiyorsunuz?");
        int fibo = scan.nextInt();
        int sayac =3;
        int a =1;
        int b =1;
        int toplam =0;
        System.out.println(toplam+a+b);
        for (int i = sayac; i <= fibo; i++) {
            toplam=a+b;
            a=b;
            b=toplam;
            System.out.println(toplam);
        }











    }
}
