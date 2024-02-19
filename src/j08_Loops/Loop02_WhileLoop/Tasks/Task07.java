package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Map;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
        Scanner input = new Scanner(System.in);
        int sayac = 1;
        int sayi = Integer.MIN_VALUE;
        while (sayac <= 5) {
            System.out.println(sayac+". sayıyı giriniz: ");
            int girilenSayi=input.nextInt();

            if (girilenSayi>sayi){
                sayi=girilenSayi;
            }
            sayac++;
        }
        System.out.println("Girilen en büyük sayi= "+sayi);

    }
}
