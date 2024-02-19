package j99_codeChallenge.Challenge02;

import java.util.Scanner;

public class Task04_Ifstatement {
    public static void main(String[] args) {
        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
       /* Scanner input = new Scanner(System.in);
        System.out.println("Bir Y yada N girin:");
        char karakter = input.next().charAt(0);
        if(karakter=='Y'||karakter=='y'){
            System.out.println("YES");

        }else if(karakter=='N'||karakter=='n'){
            System.out.println("NO");

        }else System.out.println("agam adam gibi bişey giresen:");*/

        System.out.println("Bir Y yada N girin:");
        Scanner input   = new Scanner(System.in);
        String character = input.nextLine();
        if(character=="Y"||character=="y"){
            System.out.println("YES");

        }else if(character=="N"||character=="n"){
            System.out.println("NO");

        }else System.out.println("agam adam gibi bişey giresen:");
    }
}
