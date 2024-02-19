package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
// 2316->6+1+3+2       571622->2+2+6+1+7+5

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scan.nextInt();
        int toplam = 0;
        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("toplam = " + toplam);

    }
}
