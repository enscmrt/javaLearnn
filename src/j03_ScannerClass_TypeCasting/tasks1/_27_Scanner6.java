package j03_ScannerClass_TypeCasting.tasks1;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Doğum günüzü giriniz :");
        String gun = scanner.next();
        System.out.println("Doğum gününüz = " + gun);



    }
}
