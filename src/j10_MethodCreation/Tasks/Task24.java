package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen fibonacci için bir sayı giriniz:");
        int sayi = scan.nextInt();

        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {

        int num1= 0;
        int num2= 1;
        System.out.println(num1+ " "+num2);
        for (int i = 0; i <=sayi ; i++) {
            int num3 = num1+num2;

            System.out.print(" "+num3);
            num1=num2;
            num2=num3;

        }
    }
}
