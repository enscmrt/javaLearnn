package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Char giriniz");
        char char1 = scan.next().charAt(0);
        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(char1+i)+" ");

        }*/
        System.out.println("******");
        System.out.println("Bir metin giriniz:");
        String metin = scan.nextLine();
        char karakter = scan.next().charAt(0);
        for (int i = metin.indexOf(karakter)+1; i <=metin.indexOf(karakter)+10 ; i++) {
            System.out.print(metin.charAt(i));

        }


    }
}
