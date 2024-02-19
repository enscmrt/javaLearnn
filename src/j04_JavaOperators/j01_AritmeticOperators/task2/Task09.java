package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane inek var:");
        int inekSayisi =scanner.nextInt();
        System.out.println("Kaç tane koyun var:");
        int koyunSayisi =scanner.nextInt();
        System.out.println("Kaç tane tavuk var:");
        int tavukSayisi =scanner.nextInt();
        int inekAyakSayisi = inekSayisi * 4;
        int koyunAyakSayisi = koyunSayisi * 4;
        int tavukAyakSayisi = tavukSayisi * 2;
        int toplamAyakSayisi = inekAyakSayisi + koyunAyakSayisi + tavukAyakSayisi;
        System.out.println("Çiftlikteki toplam ayak sayısı: " + toplamAyakSayisi);





    }

}
