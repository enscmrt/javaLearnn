package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını print eden code create ediniz.

(Not : KDV tutarını 18% olarak alın)

Örnek Çıktı
Tutar Giriniz : 100
KDV Oranı : %18
KDV Tutarı : 18.00
KDV'li Tutar : 118.0
Bonus Geliştirme
Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV print eden code create eden
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen pozitif tutar giriniz: ");
        double tutar = sc.nextDouble();

        if (tutar > 0 && tutar < 500) {

            double kdv = tutar * 0.18;
            System.out.println("KDV Oranı : %18");
            System.out.println("KDV Tutarı : " + kdv);
            System.out.println("KDV'li Tutar : " +(tutar + kdv));

        }else {

            double kdv = tutar * 0.08;
            System.out.println("KDV Oranı : %8");
            System.out.println("KDV Tutarı : " + kdv);
            System.out.println("KDV'li Tutar : " +(tutar + kdv));
        }


    }
}
