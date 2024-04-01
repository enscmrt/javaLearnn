package j100_JavaProject.Depo_Proje;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static j100_JavaProject.Depo_Proje.TryCatch.intGirisi;
import static j100_JavaProject.Depo_Proje.TryCatch.stringGirisi;
import static j100_JavaProject.Depo_Proje.UrunBilgisi.urunBilgisiMap;


public class islemler implements IslemlerInterface {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    public static final String BOLD = "\033[0;1m";
    @Override
    public void giris() {
        System.out.println(Y+ "         DEPO PANEL YÖNETİM SİSTEMİNE HOŞ GELDİNİZ\n========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN GIRISI  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN RAFA KOY    |              |  4-URUN CIKISI |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN LİSTELE   |              |  6-CIKIS      |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  "+R);

        System.out.print("Yapmak istediginiz islem : ");
        int secim =intGirisi();
        // scan.nextLine(); // Hata olmaması için
        switch (secim) {
            case 1:
                urunTanimlama();
                giris();
                break;
            case 2:
                urunGirisi();
                giris();
                break;
            case 3:
                urunuRafaKoy();
                giris();
                break;
            case 4:
                urunCikisi();
                giris();
                break;
            case 5:
                urunListele();
                giris();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz.");
                break;
        }

    }

    @Override
    public void urunTanimlama() {
        System.out.println("Ürün İsmi: ");
        String yeniUrunIsmi = stringGirisi();
        boolean urunVarMi = false;// Girilen ürün ismini kontrol
        for (UrunBilgisi urun : UrunBilgisi.urunBilgisiMap.values()) {
            if (urun.getUrunIsmi().equalsIgnoreCase(yeniUrunIsmi)) {
                System.out.println(Y + "Ürün ismi daha önceden tanımlanmış.\nİsterseniz İŞLEMLER MENÜDEN ->ÜRÜN GİRİŞİ bölümünden güncelleme yapabilirsiniz.");
                urunVarMi = true;
                break;
            }
        }
        if (!urunVarMi) {// Eğer ürün daha önce eklenmemişse
            UrunBilgisi obj = new UrunBilgisi();
            obj.setUrunIsmi(yeniUrunIsmi);
            System.out.println("Üretici: ");
            obj.setUretici(stringGirisi());
            System.out.println("Birim: ");
            obj.setBirim(stringGirisi());

            int id = UrunBilgisi.id;
            UrunBilgisi.urunBilgisiMap.put(id, obj);
            UrunBilgisi.id++;

            System.out.println(G + "Ürün başarıyla tanımlandı");
            System.out.println(G + "Tanımladığınız ürün aşağıda gösterildiği gibi başarıyla tanımlanmıştır:");
            System.out.printf(G + BOLD + "%-5s%-15s%-15s%-15s%n",
                    "ID", "Ürün İsmi", "Üretici", "Birim\n_________________________________________________");
            System.out.printf("%-5d%-15s%-15s%-15s%n",
                    id, obj.getUrunIsmi(), obj.getUretici(), obj.getBirim());
        }

    }

    @Override
    public void urunListele() {
        System.out.println(B + "-----------------------------------------------------------------------");
        System.out.printf(B + "%-5s%-15s%-15s%-8s%-8s%-8s%n", "ID", "İsim", "Üretici", "Miktar", "Birim", "Raf");
        System.out.println(B + "-----------------------------------------------------------------------");

        for (Map.Entry<Integer, UrunBilgisi> entry : UrunBilgisi.urunBilgisiMap.entrySet()) {
            UrunBilgisi obj = entry.getValue();
            System.out.printf(B + "%-5d%-15s%-15s%-8d%-8s%-8s%n",
                    entry.getKey(), obj.getUrunIsmi(), obj.getUretici(), obj.getMiktar(), obj.getBirim(), obj.getRaf());
        }

        System.out.println(B + "-----------------------------------------------------------------------");

    }

    @Override
    public void urunGirisi() {
        System.out.println();
        urunListele();
        System.out.println("Giriş yapmak istediğiniz ürün Id'sini girin: ");
        int id =intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Ürün miktarını giriniz: ");
            int miktar = intGirisi();
            int oldMiktar = urunBilgisiMap.get(id).getMiktar();
            urunBilgisiMap.get(id).setMiktar(oldMiktar + miktar);
            System.out.println("Id : " + id + " ürün girişi : " + miktar + " toplam miktar: " + (oldMiktar + miktar));
        } else {
            System.out.println(id + " id'ye sahip ürün bulunamadı! işlemler menuye tekrar yonlendiriliyorsunuz ");
        }
    }

    @Override
    public void urunuRafaKoy() {
        System.out.println("Rafa koymak istediğiniz ürün Id'sini girin: ");
        int id = intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Raf bilgisini giriniz: ");
            urunBilgisiMap.get(id).setRaf(stringGirisi());
        } else {
            System.out.println(id + " id'ye sahip ürün bulunamadı!");
        }
    }

    @Override
    public void urunCikisi() {
        System.out.println("urunBilgisiMap.entrySet() = " + urunBilgisiMap.entrySet());
        System.out.println("Ürün ID'sini girin: ");
        int id = intGirisi();
        if (urunBilgisiMap.containsKey(id)) {
            System.out.println("Çıkış miktarını girin: ");
            int cikisMiktari =intGirisi();
            if (urunBilgisiMap.get(id).getMiktar() >= cikisMiktari) {
                int yeniMiktar = urunBilgisiMap.get(id).getMiktar() - cikisMiktari;
                urunBilgisiMap.get(id).setMiktar(yeniMiktar);
                System.out.println("Ürün çıkışı başarıyla yapıldı.");
            } else {
                System.out.println("Girilen miktarda ürün bulunmamaktadır.");
            }
        } else {
            System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
        }
    }

    @Override
    public void cikis() {
        System.out.println("Programdan çıkılıyor... İyi günler.");
    }
}
