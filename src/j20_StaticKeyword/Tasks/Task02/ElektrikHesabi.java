package j20_StaticKeyword.Tasks.Task02;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public double odenecekTutar() {
        return fatura=toplamTuketim*oran;
    }

    public void tüketimEkle(int a) {
        toplamTuketim+=a;//Aynı class içerisinde static olmayan variable static olmayan methodda obj olmdan call edilebilir.
    }

}
