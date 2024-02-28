import java.util.Scanner;

public class Q62_PrintPrimeNumbers {

    public static void main(String[] args) {
        /* Task->
         * Print prime numbers which are less than the given number
         *  Girilen sayıya kadar asal sayıları print eden code create ediniz
         * input : 10
         * output : 2 3 5 7
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        for (int i = 2; i <sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.print(i + " ");
                }
            }
        }



    }//main sonu
}//Class sonu
