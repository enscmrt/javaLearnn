package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç sayı toplamak istiyorsunuz:");
        int adet = scan.nextInt();
        int toplam = 0;
        int sayac = 1;

        while (sayac<=adet){
            System.out.println(sayac+". sayıyı giriniz: ");
            int girilenSayi = scan.nextInt();

            toplam += girilenSayi;
            sayac++;
        }

        System.out.println((sayac-1)+" adet sayı girdiniz ve toplamı ="+toplam );


     }

}
