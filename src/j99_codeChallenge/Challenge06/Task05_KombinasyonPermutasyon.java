package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task05_KombinasyonPermutasyon {

    /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)

  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!

  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760

  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        if(sayi1<sayi2){
            System.out.println("Yanlış giriş yaptınız sayi1 sayi2den büyük olmalıdır!!!");
        } else {
            System.out.println("Doğru giriş devam ediniz");
        }
        System.out.println("kombinasyon(sayi1,sayi2) = " + kombinasyon(sayi1, sayi2));
        System.out.println("permusyon(sayi1,sayi2) = " + permusyon(sayi1, sayi2));
        faktoriyel(sayi1);



    }

    private static int faktoriyel(int sayi1) {
        if(sayi1==0){
            return 1;
        }else {
            return sayi1*faktoriyel(sayi1-1);
        }

    }

    private static int permusyon(int sayi1, int sayi2) {
        return  faktoriyel(sayi1)/faktoriyel(sayi1-sayi2);

    }

    private static int kombinasyon(int sayi1, int sayi2) {
        return faktoriyel(sayi1)/(faktoriyel(sayi2)*(faktoriyel(sayi1-sayi2)));
    }
}
