package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();
        boolean asalMi =true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi=false;
                break;
            }
        }
        System.out.println(asalMi?sayi+"sayısı asal sayıdır":sayi+"sayısı asal değildir");


       /* for (int i = 2; i <= sayi; i++) {
            if (i == sayi){
                System.out.println("girilen sayı asal");
            }
            else if (sayi % i == 0) {
                System.out.println("girilen sayı asal değil");
                break;
            }
        }*/
    }
}
