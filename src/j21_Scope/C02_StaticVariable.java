package j21_Scope;

public class C02_StaticVariable {

    static  String firmaIsim="Clarusway";
    static  int firmaId;
    static  boolean firmaIt;


    public static void main(String[] args) {
        /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
   ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
    bulmak icin sadece o objeyi dikkate alınır

  Static variabler ise class variable olarak tanimlanir
  ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

*/
        System.out.println("firmaIt = " + firmaIt);//static variable dogrudan call edildi.
        firmaIt=true;
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);//Clarusway
        staticMeth();
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);//QA TESTER
        //nonStaticMeth();//doğrudan call edilemez CTE verir.
    }
    public  static void staticMeth(){
        System.out.println("Static meth run edildi");
        firmaId=1001;
        C02_StaticVariable obj =new C02_StaticVariable();
        obj.nonStaticMeth();//obj ile nonstatic meth call edildi.
    }
    public  void nonStaticMeth(){
        firmaIsim="QA Tester";
        System.out.println("NonStaticMeth den selamlar");
        //staticMeth();//static meth nonstatic scope ta doğrudan call edildi
    }
}
