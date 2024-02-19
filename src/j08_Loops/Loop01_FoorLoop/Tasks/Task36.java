package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        double toplam = 0.0;

        for (int i = 1; i <= sayi; i++) {
            toplam += 1.0 / i;
        }
        System.out.println("Harmonik serisi = " + toplam);



    }
}
