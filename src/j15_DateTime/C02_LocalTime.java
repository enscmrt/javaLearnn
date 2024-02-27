package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)

        LocalTime suAn=LocalTime.now();
        // LocalTime -> olusturulurken new keyword kullanılmaz!!!
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());

        LocalTime saat1= LocalTime.of(9,43,21,1907);
        LocalTime saat2= LocalTime.of(9,43);
        LocalTime saat3= LocalTime.of(19,10,21);
        //tanımlanan herhangi bir time öncesi ->plus(), sonrası minus() ile gidilir.

        System.out.println("suAn.plusMinutes(36).minusHours(12) = " + suAn.plusMinutes(36).minusHours(12));
        LocalTime loopStart = LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int toplam =0;
        for (int i = 0; i < 10000; i++) {
            toplam+=i;


        }
        LocalTime finishloop = LocalTime.now();
        System.out.println("finishloop.getNano() = " + finishloop.getNano());
        System.out.println("Loop run hızı : "+(finishloop.getNano()-loopStart.getNano()));


    }
}
