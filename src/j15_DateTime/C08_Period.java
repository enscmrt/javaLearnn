package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // priod-> iki tarih arasındaki geçen tekrarlana datayı tutar..
        LocalDate bugun =LocalDate.now();
        LocalDate saimDT= LocalDate.of(1988,12,07);
        Period p1 = Period.between(bugun,saimDT);
        System.out.println("p1 = " + p1);
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());
        System.out.println("p1.getDays() = " + p1.getDays());
        System.out.println("p1.getYears() = " + p1.getYears());

        Period period6Gun=Period.ofDays(6);
        System.out.println("bugun.minus(p1) = " + bugun.plus(p1));
        System.out.println("bugun.plus(period6Gun) = " + bugun.minus(period6Gun));

        // Task-> 02 Ocak 2024 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.

        Period priodCw =Period.ofMonths(11);
        LocalDate kursStart =LocalDate.of(2024,01,02);
        System.out.println("Kurs bitiş tarihi : " + kursStart.plus(priodCw).format(DateTimeFormatter.ISO_LOCAL_DATE));

        // ISO -> International Organization for Standardization
        // ahan da trick-> period tanımında birden çok tarih zaman girildiğinde daima sonuncu parametre derlenir. önceki parmetler ezilir
        Period prd=Period.ofMonths(4).ofDays(35);
        System.out.println("bugun.plus(prd) = " + bugun.plus(prd));//2024-04-01


    }
}
