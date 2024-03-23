package j26_Abstract.abstract05;


import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        j26_Abstract.abstract05.Kedi kedi = new j26_Abstract.abstract05.Kedi();
        //kedi.setId();
        kedi.setIsim("Köpük");
        kedi.setVahsi(false);
        kedi.setDogumTarih(LocalDate.of(2018, 1, 5));
        System.out.println(kedi);
//        kedi.yiyecegi();
//        kedi.yemekMiktari();
//        kedi.gunlukUykuSuresi();
//        kedi.sesi();

        j26_Abstract.abstract05.Kartal kartal = new j26_Abstract.abstract05.Kartal();
        //kartal.setId();
        kartal.setIsim("Gezgin");
        kartal.setVahsi(true);
        kartal.setDogumTarih(LocalDate.of(2018, 1, 5));
        System.out.println(kartal);
//        kartal.yiyecegi();
//        kartal.gunlukUykuSuresi();
//        kartal.yemekMiktari();
//        kartal.sesi();

        System.out.println(j26_Abstract.abstract05.Hayvan.sayac);

    }
}
