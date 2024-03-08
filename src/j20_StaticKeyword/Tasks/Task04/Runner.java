package j20_StaticKeyword.Tasks.Task04;

import java.util.Scanner;

public class Runner {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



    public static void main(String[] args) {
        Bisiklet obj1=new Bisiklet(20,2);
        System.out.println("obj1.durumGoster() = " + obj1.durumGoster());
        System.out.println("obj1.vitesAzalt() = " + obj1.vitesAzalt());
        System.out.println("obj1.vitesArtir() = " + obj1.vitesArtir());
        obj1.islemYap();
        System.out.println("obj1.hizDegistir(15) = " + obj1.hizDegistir(15));


    }

}
