package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scan.nextLine();
        String tersmetin = "";
        System.out.println("Girilen metin = " + metin);
        for (int i = metin.length()-1; i >= 0; i--){
            tersmetin += metin.charAt(i);
        }
        System.out.println("Girilen metnin tersi="+tersmetin);
        if (metin.equalsIgnoreCase(tersmetin)){
            System.out.println("Girilen metin polindrome dir");

        }else System.out.println("Girilen metin polindrome değildir");


    }
}



