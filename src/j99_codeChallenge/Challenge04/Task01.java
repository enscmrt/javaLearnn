package j99_codeChallenge.Challenge04;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ad giriniz ");
        String name = sc.next();
        System.out.print("Soyad giriniz ");
        String surname = sc.next();
        System.out.println("name.toUpperCase()+\" \"+surname.toUpperCase() = " + name.toUpperCase() + " " + surname.toUpperCase());


    }

}
