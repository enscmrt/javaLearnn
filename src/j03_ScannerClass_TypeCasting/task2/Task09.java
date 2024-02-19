package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("a sayisini giriniz: ");
        int a = scanner.nextInt();
        System.out.println("b sayisini giriniz: ");
        int b = scanner.nextInt();
        System.out.println("c sayisini giriniz: ");
        int c = scanner.nextInt();
        System.out.println("sonuç: "+((a*a)-(b*b))/(c*3));



    }
}
