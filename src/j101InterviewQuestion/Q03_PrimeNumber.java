import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayı giriniz");
        int sayı = scan.nextInt();
        boolean asalMi= true;

            if (sayı>=2){
                for (int i = 2; i < sayı; i++) {
                    if (sayı % i == 0) {
                        asalMi=false;
                        break;
                    }
                }
                if(asalMi){
                    System.out.println("Girilen "+sayı+" sayısı asal sayıdır");

                }else {
                    System.out.println("Girilen "+sayı+" sayısı asal sayı değildir");
                }

            }else System.out.println("Girilen sayı asal değildir");




    }
}
