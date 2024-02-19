package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.nextLine();
        do {
            if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
                System.out.println("İlk harf büyüktür.");
            }else{
                System.out.println("İlk harf büyük değildir.");
                break;
            }

        }while (false);
        }



    }

