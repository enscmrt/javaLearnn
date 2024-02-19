package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     */

    public static <scanner> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen saat giriniz= ");
        int saat = scanner.nextInt();
        System.out.println("Lütfen dakika giriniz=");
        int dakika = scanner.nextInt();
        System.out.println("Lütfen saniye giriniz=");
        int saniye = scanner.nextInt();
        System.out.println("Toplam saniye = "+(saat*3600)+(dakika*60)+saniye);

    }

}



























