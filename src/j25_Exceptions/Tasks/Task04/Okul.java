package j25_Exceptions.Tasks.Task04;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAd;
    private int maxOgrSayisi;
    private List<Ogrenci> ogrenciler;
    public static List<Okul> okulList = new ArrayList<>();

    public Okul(String okulAd, int maxOgrSayisi) {
        this.okulAd = okulAd;
        this.maxOgrSayisi = maxOgrSayisi;
        this.ogrenciler = ogrenciler;
    }

    public Okul() {
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrSayisi() {
        return maxOgrSayisi;
    }

    public void setMaxOgrSayisi(int maxOgrSayisi) {
        this.maxOgrSayisi = maxOgrSayisi;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public boolean ogrenciEkle(Ogrenci ogrenci) {
        try {
            if (ogrenci.getYas() > 15) {
                throw new IllegalArgumentException("Öğrencinin yaşı 15'i geçemez.");
            }

            if (ogrenciler.size() >= maxOgrSayisi) {
                throw new IllegalStateException("Maksimum öğrenci sayısına ulaşıldı.");
            }

            ogrenciler.add(ogrenci);
            System.out.println(ogrenci.getAd() + " öğrencisi eklendi.");
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

