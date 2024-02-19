package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz = ");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu kg olarak giriniz = ");
        double kilo = scanner.nextDouble();
        System.out.println("Vucut kitle endeksiniz : " + (kilo / (boy * boy)));



    }
}
