package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {
    //task01->Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //task02->6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //task03->Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printTekSayilar(list);
        System.out.println();
        print6ve14ArasiKare(list);
        System.out.println();
        printTekKarekokToplam(list);

    }

    private static void printTekKarekokToplam(List<Integer> list) {
        list.stream().filter((t)->t%2==1).map(t->(int)Math.sqrt(t)).forEach(SeedMethods::intYazdir);
    }

    private static void print6ve14ArasiKare(List<Integer> list) {
        list.stream().filter((t)->t>6&&t<14).map(t->(int)Math.pow(t,2)).forEach(SeedMethods::intYazdir);
    }

    private static void printTekSayilar(List<Integer> list) {
        list.stream().filter((t)->t%2==1).forEach(SeedMethods::intYazdir);
    }

    // Task 01 -> //Fonksiyonel Programlama ile listedeki tüm tek sayıları yazdırın



    // Task 02 --> 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz


    //Task 03 --> Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    
}
