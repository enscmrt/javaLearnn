package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

    //  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
    public static void main(String[] args) {
        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz
        Scanner scan =new Scanner(System.in);
        /*System.out.println("Karenin bir kenarını giriniz :");
        int kenar = scan.nextInt();
        int kareAlanı= kenar*kenar;
        System.out.println("kareAlanı= "+ (kenar*kenar));*/
       // System.out.println("kareAlanı= "+ kareAlanı);

        /*
 Task->
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :
         Output : Yilda 12.41 kg seker kullaniyorsunuz

 */
        System.out.println("Günde kaç bardak çay içersiniz? ");
        int gunlukCayMiktarı = scan.nextInt();
        System.out.println("Caya kac seker atıyorsunuz? ");
        int sekerSayisi = scan.nextInt();
        System.out.println("Yılda "+((gunlukCayMiktarı*sekerSayisi*1.7*365)/1000)+ "kg");




    }
}
