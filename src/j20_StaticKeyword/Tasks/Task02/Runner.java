package j20_StaticKeyword.Tasks.Task02;

public class Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */


    public static void main(String[] args) {
        Musteri musteri=new Musteri();
        musteri.name="enes";
        ElektrikHesabi odeme=new ElektrikHesabi();
        musteri.elektrikHesabi=odeme;
        musteri.elektrikHesabi.tüketimEkle(50);
        musteri.elektrikHesabi.tüketimEkle(60);
        System.out.println("musteri.elektrikHesabi.toplamTuketim = " + musteri.elektrikHesabi.toplamTuketim);
        System.out.println("musteri.elektrikHesabi.odenecekTutar() = " + musteri.elektrikHesabi.odenecekTutar());
        System.out.println("musteri.elektrikHesabi.fatura = " + musteri.elektrikHesabi.fatura);


    }


}
