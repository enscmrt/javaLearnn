package j14_Varargs.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task05 {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istenildiği kadar seçildiğinde
         ders saatleri toplamı 12'yi gecerse "AGAM Limiti astiniz";
        12'yi gecmezse "AGAM gayet başarılı :)" print eden METHOD create ediniz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
        int matematik =4;
        int geometri=2;
        int fizik=3;
        int kimya=3;
        int biyoloji=3;
        int edebiyat=2;
        int tarih=2;
        int cografya=2;

        dersSecim(matematik,geometri,fizik,kimya,biyoloji,edebiyat,tarih,cografya);

    }

    private static void dersSecim(int ... lessos) {
        List<Integer>secilenDersListesi=new ArrayList<>();
        List<Integer>dersSaatleriListesi=new ArrayList<>();
        for (int each: lessos){
            dersSaatleriListesi.add(each);

        }
         int dersSaatleriToplami=0;
        while (dersSaatleriToplami<13){
            if (dersSaatleriToplami>=12) break;
            dersSaatleriToplami=0;
            System.out.print("Matematik (4)->1\nGeometri (2)->2" +
                    "\nFizik (3)->3\nKimya (3)->4\nBiyoloji (3)->5\nEdebiyat(2)->6\nTarih (2)->7\nCografya " +
                    "(2)->8\nlutfen ders seciniz:");
            int secim = scan.nextInt();
            switch (secim){
                case 1:
                    secilenDersListesi.add(dersSaatleriListesi.get(0));
                    break;
                case 2:
                    secilenDersListesi.add(dersSaatleriListesi.get(1));
                    break;
                case 3:
                    secilenDersListesi.add(dersSaatleriListesi.get(2));
                    break;
                case 4:
                    secilenDersListesi.add(dersSaatleriListesi.get(3));
                    break;
                case 5:
                    secilenDersListesi.add(dersSaatleriListesi.get(4));
                    break;
                case 6:
                    secilenDersListesi.add(dersSaatleriListesi.get(5));
                    break;
                case 7:
                    secilenDersListesi.add(dersSaatleriListesi.get(6));
                    break;
                case 8:
                    secilenDersListesi.add(dersSaatleriListesi.get(7));
                    break;
            }
            for (int i = 0; i < secilenDersListesi.size(); i++) {
                dersSaatleriToplami+=secilenDersListesi.get(i);
            }
        }
        if (dersSaatleriToplami>12) System.out.println("AGAM Limiti astiniz\nSectiginiz toplam ders saati " + dersSaatleriToplami + "'dir.");
        else System.out.println("AGAM gayet başarılı :)\nSectiginiz toplam ders saati " + dersSaatleriToplami + "'dir.");


    }


}
