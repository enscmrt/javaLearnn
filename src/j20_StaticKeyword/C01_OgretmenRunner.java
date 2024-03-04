package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
C01_Ogretmen t1 = new C01_Ogretmen("Sema",11);
        System.out.println("t1.isim = " + t1.isim);
        System.out.println("t1.tecrübe = " + t1.tecrübe);
        t1.evlilikTebrikEt();
        C01_Ogretmen.maasHesapla();
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//class name ile static variable call edildi
        C01_Ogretmen.okulIsmi="Sivas Anadolu Lisesi";
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);
        C01_Ogretmen t2 = new C01_Ogretmen("Selim",13);
        System.out.println("t2.tecrübe = " + t2.tecrübe);
        System.out.println("t2.isim = " + t2.isim);
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);
        C01_Ogretmen t3 = new C01_Ogretmen();
        System.out.println("t3.tecrube = " + t3.tecrübe);//0
        System.out.println("t3.isim = " + t3.isim);//null


    }
}
