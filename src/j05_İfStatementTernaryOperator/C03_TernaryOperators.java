package j05_İfStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperators {
    /*
Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
 */
    public static void main(String[] args) {
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = scanner.nextInt();
        if(sayi%2==0){
            System.out.println(sayi+"Sayısı çift");

        }else {
            System.out.println((sayi+"sayı tek"));

        }

        String sonuc = sayi%2==0?sayi+"Sayı çift":sayi+"Sayı tek";
        System.out.println("sonuc = " + sonuc);*/

        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        System.out.println("Bir sayı giriniz = ");
        Scanner scanner= new Scanner(System.in);
        int sayi2 = scanner.nextInt();
        System.out.println(sayi2 >= 0 ? "Pozitif" : "Negatif");
        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.
        int sayi1 = scanner.nextInt();
        System.out.println("Büyük sayı ="+(sayi1>sayi2?sayi1:sayi2));
        /*
ahan da trick köşesinde böğünn : ternary operator action sonucu true veya false  agöre verecği output(çıktı) eğer
data type uygun bir variable(container->kutu) a atnamzsa CTE verir.
Çözüm olarak teranry çıktısı ya bir variable atanmalaı yada sout gibi doğrudan bir action'da kullanılmalı
 */
        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        Object sonuc = sayi1*sayi2<0?sayi1+sayi2:"Agam DEVAMKEEE";
        System.out.println("sonuc = " + sonuc);
        //hap bilgi -> Ternary ciktisi farkli data type'lardan(int,String,boolean vb) tanimlanmissa
//tum data type atasi olan Hz.Adem classina(Object) atanir


    }
}
