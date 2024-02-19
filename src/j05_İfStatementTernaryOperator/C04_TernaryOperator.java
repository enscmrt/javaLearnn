package j05_İfStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = scanner.nextInt();
        System.out.println(sayi<10 && sayi>-10?sayi+" sayisi bir basamakli"
                :sayi+" sayisi 2 veya daha fazla basamakli");

    }
}
