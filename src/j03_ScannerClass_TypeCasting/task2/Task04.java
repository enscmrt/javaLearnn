package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clarusway Spor Salonu üyelik Sistemi");
        System.out.println("Üye İsim  giriniz = ");
        String isim = scanner.next();
        System.out.println("Üye Soyismi giriniz = ");
        String Soyisim = scanner.next();
        System.out.println("Kullanıcı yaş  giriniz = ");
        int yas = scanner.nextInt();
        System.out.println("Kullanıcı kilo  giriniz = ");
        int kilo = scanner.nextInt();
        System.out.println("Kullanıcı boy giriniz = ");
        int boy = scanner.nextInt();
        System.out.println("Kullanıcı abonelik süresi giriniz ="+"Ay");
        int abone = scanner.nextInt();
        System.out.println("abonelik ücreti = " + abone*20+"$");




    }
}
