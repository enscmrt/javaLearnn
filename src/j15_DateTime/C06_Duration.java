package j15_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece =LocalTime.of(0,0);
        LocalTime gunduz =LocalTime.of(12,30);
        Duration fark1 =Duration.between(gece, gunduz);
        Duration fark2 =Duration.between(gunduz, gece);
        System.out.println("fark1 = " + fark1);
        System.out.println("fark2 = " + fark2);
        System.out.println("fark2.getSeconds() = " + fark2.getSeconds());
    }
}
