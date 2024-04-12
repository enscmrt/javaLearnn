package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Scanner;

public class KisiKayit {

    private HashMap<String, Kisi> kisiler;
    private Scanner scanner;

    public KisiKayit() {
        kisiler = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void kayit() {
        System.out.println("TC Kimlik Numarası:");
        String tc = scanner.next();
        System.out.println("Ad Soyad:");
        String adSoyad = scanner.next();
        scanner.nextLine(); // Boş satırı oku
        System.out.println("Adres:");
        String adres = scanner.nextLine();
        System.out.println("Telefon:");
        String telefon = scanner.next();

        Kisi kisi = new Kisi(adSoyad, adres, telefon);
        kisiler.put(tc, kisi);
        System.out.println("Kişi kaydedildi.");
    }

    public void goster() {
        System.out.println("TC Kimlik Numarası:");
        String tc = scanner.next();
        Kisi kisi = kisiler.get(tc);
        if (kisi != null) {
            System.out.println("Ad Soyad: " + kisi.getAdSoyad());
            System.out.println("Adres: " + kisi.getAdres());
            System.out.println("Telefon: " + kisi.getTelefon());
        } else {
            System.out.println("Kişi bulunamadı.");
        }
    }

    public void sil() {
        System.out.println("TC Kimlik Numarası:");
        String tc = scanner.next();
        Kisi kisi = kisiler.remove(tc);
        if (kisi != null) {
            System.out.println("Kişi silindi.");
        } else {
            System.out.println("Kişi bulunamadı.");
        }
    }

    public void run() {
        boolean devam = true;
        while (devam) {
            System.out.println("1. Kayıt\n2. Göster\n3. Sil\n4. Çıkış");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    kayit();
                    break;
                case 2:
                    goster();
                    break;
                case 3:
                    sil();
                    break;
                case 4:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }

    public static void main(String[] args) {
        KisiKayit kayitProgrami = new KisiKayit();
        kayitProgrami.run();
    }
}

class Kisi {
    private String adSoyad;
    private String adres;
    private String telefon;

    public Kisi(String adSoyad, String adres, String telefon) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }
}

