package j99_codeChallenge.Challenge04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("isim giriniz ");
        String isim = input.next();
        System.out.print("soyisim giriniz ");
        String soyisim = input.next();
        if (isim.length()>soyisim.length()){
            System.out.println(isim +"daha uzundur");
        } else if (isim.length()<soyisim.length()){
            System.out.println(soyisim +"daha uzundur");

        } else System.out.println(soyisim+"daha uzundur");


        Scanner scan = new Scanner(System.in);
        System.out.println("adınız : ");
        String name = scan.next();
        System.out.println(name);


    }

}