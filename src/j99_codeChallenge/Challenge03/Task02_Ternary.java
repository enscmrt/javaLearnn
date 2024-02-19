package j99_codeChallenge.Challenge03;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Agam hele fiyat giresen");
        int fiyat = scan.nextInt();
        if(fiyat>=10){
            if(fiyat>=10&&fiyat<20){
                System.out.println("Normal");
            }else System.out.println("Pahalı");

        }else System.out.println("Ucuz");

        System.out.println(fiyat<10?"ucuz":(fiyat>=10&&fiyat<20?"normal":"pahalı"));

    }
}
