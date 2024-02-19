package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task24 { public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

    Scanner scanner = new Scanner(System.in);
    System.out.println("Lutfen kilometre giriniz");
    double kilometre = scanner.nextDouble();
    double taksimetre = 10+2.20*kilometre;
    int kısaMesafe= 20;
    int acılıs= 10;
    System.out.println(kilometre<=2?"Ücret="+kısaMesafe:"Ücret="+(acılıs+taksimetre));


}
}
