package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)

        LocalDate bugun =LocalDate.now();
        //Trick -> LocalDate de new keyword kullanılmaz!!!
        System.out.println("bugun = " + bugun);
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());


        System.out.println("*****");
        LocalDate tarih1 = LocalDate.of(1974,05,22);
        LocalDate tarih2 = LocalDate.of(1985, Month.MARCH,12);
        //tanımlanan bir date öncesi minus() ->sonrasında ise plus() kullanılır
        System.out.println("tarih1 = " + tarih1);
        System.out.println("tarih1.minusYears(34).plusMonths(34).plusDays(34) = " + tarih1.minusYears(34).plusMonths(34).plusDays(34));
    }
}
