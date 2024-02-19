package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        System.out.println("Lütfen ikinci bir sayı giriniz:");
        int sayi2 = scan.nextInt();
        for (int i = sayi<sayi2?sayi:sayi2; i<(sayi>sayi2?sayi:sayi2); i++) {
            System.out.print(i+" ");
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        System.out.println("Lütfen ikinci bir sayı giriniz:");
        int sayi2 = scan.nextInt();
        int i = sayi<sayi2?sayi:sayi2;
        while (i<(sayi>sayi2?sayi:sayi2)) {
            System.out.print(sayi+" ");
            i++;
            sayi++;
        }
       /* Scanner sc =new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        int sayi1=sc.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        int sayi2=sc.nextInt();
        int num=Math.min(sayi1,sayi2);
        while (num<=Math.max(sayi1,sayi2)){
            System.out.print(num+" ");
            num++;
        }*/






    }
}
