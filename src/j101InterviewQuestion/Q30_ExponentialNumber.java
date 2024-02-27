import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı tabanı giresen : ");
        int taban = input.nextInt();
        System.out.println("Agam bi sayı üssü giresen");
        int us = input.nextInt();
        System.out.println("*** for loop*****");
        int sonuc =1;
       // for (int i = 1; i <= us; i++) {
        //    sonuc*=taban;
        //
        //}System.out.println(sonuc);

        while (us!=0){
            sonuc*=taban;
            us--;
        }
        System.out.println(sonuc);

    }
}
