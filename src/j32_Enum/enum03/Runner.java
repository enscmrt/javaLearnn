package j32_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
/*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.
*/
        Kitap ktb1=new Kitap();
        ktb1.name="Leyle ile Mecnun";
        //ktb1.kategori="roman";
        ktb1.kategori=Kategori.ROMAN;

        Kitap ktb2=new Kitap();
        ktb2.name="Nun Masallari";
        //ktb2.kategori="orman";
        ktb2.kategori=Kategori.ROMAN;

        Kitap ktb3=new Kitap();
        ktb3.name="Masal Masal Icinde";
        //ktb3.kategori="roman";
        ktb3.kategori=Kategori.ROMAN;

        ArrayList<Kitap> kutuphane=new ArrayList<>(Arrays.asList(ktb1,ktb2,ktb3));
//        for (Kitap k:kutuphane){
//            if (k.kategori.equalsIgnoreCase("roman")){
//                System.out.println(k.name);
//            }
//        }

        for (Kitap k:kutuphane){
            if (k.kategori==Kategori.ROMAN){
                System.out.println(k.name);
            }
        }
    }
}
