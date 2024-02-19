package j99_codeChallenge.Challenge05;

import java.util.Scanner;

public class Task08 {


   /*
   Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int num1 = input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
        int toplam =0;
        for (int i = num1<num2?num1:num2; i<=(num1<num2?num2:num1); i++) {
            System.out.println(i+" ");
            toplam+=i;

        }
        System.out.println("toplam ="+toplam);

    }


}
