package j99_codeChallenge.Challenge01;

import java.util.Scanner;

public class Task07_ScannerObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz = ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz = ");
        int sayi2 = scanner.nextInt();
        System.out.println("Toplam="  +sayi1+ "Farkı="+sayi2);

    }
}
