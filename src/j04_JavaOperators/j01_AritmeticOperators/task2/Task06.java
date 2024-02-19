package j04_JavaOperators.j01_AritmeticOperators.task2;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int birlerBas = sayi % 10;
        int yüzlerBas = sayi / 100;
        int onlarBas =(sayi/10)%10;
        System.out.println("Girdiginiz sayinin birler basamagi : "+birlerBas+"\n"
                +"Girdiginiz sayinin onlar basamagi : "+onlarBas+"\n"
                +"Girdiginiz sayinin yuzler basamagi : "+yüzlerBas);


    }
}
