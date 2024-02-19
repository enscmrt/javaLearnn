package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        if (sayi<1000&&sayi>=100) {
            System.out.println("Sayı 3 basamakli");

        } else if (sayi<1000&&sayi>=10) {
            System.out.println("Sayı 2 basamakli");

        }else
            System.out.println("Sayı 3 basamakli yada 2 basamakli degildir");


    }
}
