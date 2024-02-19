package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        int faktöriyel = 1;
        if(sayi>=1){
            for (int i = 1; i <= sayi; i++) {
                faktöriyel*=i;

            }
            System.out.println(sayi+"! ="+faktöriyel);
        }else System.out.println("Lütfen geçerli bir sayı giriniz");









    }
}
