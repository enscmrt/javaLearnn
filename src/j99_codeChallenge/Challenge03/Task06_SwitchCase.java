package j99_codeChallenge.Challenge03;

import java.util.Scanner;

public class Task06_SwitchCase {
    /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A B ve C harflerinden birini seçiniz: ");
        String kullanici = scan.nextLine().toUpperCase();

        switch (kullanici) {
            case "A":
                System.out.println("Java is easy");
                break;
            case "B":
                System.out.println("Java is fun");
                break;
            case "C":
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");
        }



    }
}
