package j19_Constructor;

import j01_Variables.C01_HelloWorld;

public class C01_Constructor {//class level
    /*
N e D e N  --> OOP <--  k U l L a N ı L ı R...
 Nesne Yönelimli Programlamanın(oop) Faydaları
 1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
 2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
 3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
 4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
 5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
Bu zaman kaybını büyük ölçüde azaltır.
 */
// fields-> obj variable => obj değerlerin aldıgı alan özellikler
    String str;//class levelda obj variable oluşturdum initial edilmemiş default değer alan tanımlandı
    String selam ="Herkese selamlar bolca offerlar";//class levelda obj variable oluşturdum initial edilmiş değer atandı tanımlandı
    //C01_Constructor obj1 =new C01_Constructor();//class levelda parametresiz constructor create edildi.
    C01_HelloWorld obj99 =new C01_HelloWorld();//hariçten p siz bir obj create edildi

    /*
    1- consturctor ismi Calss name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
    2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
    3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
    4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
    5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
    6- Fields-> obj'nin uretilirken alacagı değer instance variables
    7- bir class'da bir den çok cons. tanımlanabilir.
     */




    public static void main(String[] args) {//main level
        String maindekiVariable ="mainden selamlar";//main scope da variable create edildi.
        //classİsmi   obj name = new    Constructor -> obj create edildi.
        C01_Constructor obj1=new  C01_Constructor();//farklı scope ta aynı isimde obj create edildi
        //C01_Constructor obj1=new C01_Constructor();// aynı scope da aynı isimde obj create edilmez
        C01_Constructor obj2 = new C01_Constructor();//aynı scope da farklı isimde istenilen kadar obj create edilebilir.
        C01_Constructor obj3 = new C01_Constructor();

        obj1.str="JavaNaz";
        obj3.str ="JavaHan";
        //maindeki variable main içinde olduğu için obj olmadan çağrılabilir
        //selam variable class levelda olan obj olmadan cagrılmaz
        obj2.selam="Devam edelim";
        System.out.println("obj1.selam = " + obj1.selam);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj2.selam = " + obj2.selam);
        System.out.println("obj3.str = " + obj3.str);
        staticMeth();//güneş olan meth her gezegene erişebilen meth call edildi
        obj3.nonStaticMeth();//obj ile nonstatic meth call edildi



    }//main sonu

    public  void  nonStaticMeth(){
        System.out.println("NonStaticMeth den selamlar");
    }
public  static void staticMeth(){
        System.out.println("StaticMeth den selamlar");

}


}//class sonu
