package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        int sayı = input.nextInt();
        int toplam = 0;
        for (int i = sayı; i >0 ; i/=10) {
            toplam += i%10;

        }
        System.out.println("toplam = " + toplam);


    }
}
