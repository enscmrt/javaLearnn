package j03_ScannerClass_TypeCasting.tasks1;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.

        Scanner scanner = new Scanner (System.in);
        System.out.println("10 yıl önce yaşadığınız şehiri giriniz :");
        String sehir = scanner.next();
        System.out.println("10 yıl önce yaşadığınız sehir = " + sehir);




    }
}
