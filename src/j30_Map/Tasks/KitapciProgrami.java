package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import java.util.*;

class Kitap {

//         * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
//         * yazarAdi,yayinYili,fiyati bilgilerini girelim
//         *
//         * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
//         * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
//         * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
    int kitapNo;
    String kitapAdi;
    String yazarAdi;
    int yayinYili;
    double fiyat;

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }
}

public class KitapciProgrami {
    private static List<Kitap> kitapListesi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int siradakiKitapNo = 1000;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int secim;
        do {
            System.out.println("1- Kitap ekle");
            System.out.println("2- Numara ile kitap görüntüle");
            System.out.println("3- Bilgi ile kitap görüntüle");
            System.out.println("4- Numara ile kitap sil");
            System.out.println("5- Tüm kitapları listele");
            System.out.println("6- Bitir");
            System.out.print("Seçiminizi yapınız: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    kitapEkle();
                    break;
                case 2:
                    numaraIleKitapGoruntule();
                    break;
                case 3:
                    bilgiIleKitapGoruntule();
                    break;
                case 4:
                    numaraIleKitapSil();
                    break;
                case 5:
                    tumKitaplariListele();
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyiniz.");
                    break;
            }
        } while (secim != 6);
    }

    private static void kitapEkle() {
        System.out.print("Kitap adı: ");
        String kitapAdi = scanner.next();
        System.out.print("Yazar adı: ");
        String yazarAdi = scanner.next();
        System.out.print("Yayın yılı: ");
        int yayinYili = scanner.nextInt();
        System.out.print("Fiyatı: ");
        double fiyat = scanner.nextDouble();

        Kitap yeniKitap = new Kitap(siradakiKitapNo++, kitapAdi, yazarAdi, yayinYili, fiyat);
        kitapListesi.add(yeniKitap);
        System.out.println("Kitap başarıyla eklendi.");
    }

    private static void numaraIleKitapGoruntule() {
        System.out.print("Görüntülemek istediğiniz kitabın numarasını girin: ");
        int kitapNo = scanner.nextInt();
        for (Kitap kitap : kitapListesi) {
            if (kitap.kitapNo == kitapNo) {
                System.out.println("Kitap No: " + kitap.kitapNo);
                System.out.println("Kitap Adı: " + kitap.kitapAdi);
                System.out.println("Yazar Adı: " + kitap.yazarAdi);
                System.out.println("Yayın Yılı: " + kitap.yayinYili);
                System.out.println("Fiyatı: " + kitap.fiyat);
                return;
            }
        }
        System.out.println("Belirtilen numaraya sahip bir kitap bulunamadı.");
    }

    private static void bilgiIleKitapGoruntule() {
        System.out.print("Görüntülemek istediğiniz kitabın adını veya yazarını girin: ");
        String arananKelime = scanner.next();
        for (Kitap kitap : kitapListesi) {
            if (kitap.kitapAdi.equalsIgnoreCase(arananKelime) || kitap.yazarAdi.equalsIgnoreCase(arananKelime)) {
                System.out.println("Kitap No: " + kitap.kitapNo);
                System.out.println("Kitap Adı: " + kitap.kitapAdi);
                System.out.println("Yazar Adı: " + kitap.yazarAdi);
                System.out.println("Yayın Yılı: " + kitap.yayinYili);
                System.out.println("Fiyatı: " + kitap.fiyat);
                return;
            }
        }
        System.out.println("Belirtilen bilgilere sahip bir kitap bulunamadı.");
    }

    private static void numaraIleKitapSil() {
        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int kitapNo = scanner.nextInt();
        for (Iterator<Kitap> iterator = kitapListesi.iterator(); iterator.hasNext(); ) {
            Kitap kitap = iterator.next();
            if (kitap.kitapNo == kitapNo) {
                iterator.remove();
                System.out.println("Kitap başarıyla silindi.");
                return;
            }
        }
        System.out.println("Belirtilen numaraya sahip bir kitap bulunamadı.");
    }

    private static void tumKitaplariListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("Kitaplık şu anda boş.");
            return;
        }
        System.out.println("Tüm kitaplar:");
        for (Kitap kitap : kitapListesi) {
            System.out.println("Kitap No: " + kitap.kitapNo);
            System.out.println("Kitap Adı: " + kitap.kitapAdi);
            System.out.println("Yazar Adı: " + kitap.yazarAdi);
            System.out.println("Yayın Yılı: " + kitap.yayinYili);
            System.out.println("Fiyatı: " + kitap.fiyat);
            System.out.println("----------------------");
        }
    }
}

