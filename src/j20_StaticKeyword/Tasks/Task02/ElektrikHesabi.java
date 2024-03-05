package j20_StaticKeyword.Tasks.Task02;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public double odenecekTutar() {
        return fatura=toplamTuketim*oran;
    }

    public void tüketimEkle(int a) {
        toplamTuketim+=a;
    }

}
