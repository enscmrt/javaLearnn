package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String metin = scan.nextLine();
        for (int i= 0; i<metin.length(); i++){
            if(i%2==0){

                System.out.print(metin.toUpperCase().charAt(i));
            }else System.out.println(metin.toLowerCase().charAt(i));
        }


    }
}
