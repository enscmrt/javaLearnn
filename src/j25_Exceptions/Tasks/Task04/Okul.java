package j25_Exceptions.Tasks.Task04;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAd;
    private int maxOgrSayisi;
    private List<Ogrenci> ogrenciler;
    public static List<Okul> okulList = new ArrayList<>();

    public Okul(String okulAd, int maxOgrSayisi, List<Ogrenci> ogrenciler) {
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

    @Override
    public String toString() {
        return
                "okulAd='" + okulAd + '\'' +
                ", maxOgrSayisi=" + maxOgrSayisi +
                ", ogrenciler=" + ogrenciler;
    }
}
