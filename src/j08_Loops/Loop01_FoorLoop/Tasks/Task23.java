package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        int sayı = input.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayı; i++) {
            toplam += i * i;
        }
        System.out.println(toplam);



    }
}
