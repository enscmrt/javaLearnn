package j21_Scope;

public class C01_InstanceVariable {//class level

    static  String kurs="Clarusway";
    static  String prLanguage;

    int yas =49;//initial edili-miş obj variable
    int tecrube;
    String isim;//->null
    boolean developer;
    double boy;
    char unvan;
    /*                                   INSTANCE VARIABLE

    1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
        olusturulan variable'lara non-Static Class level "instance variable" denir.
    2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
    3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
        Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
        Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
            "yas" variable'i initialize edildi, digerleri initialize edilmedi.
    4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                byte, short, int, long icin default value 0'dir.
                float, double --> default value 0.0'dir.
                char --> default value ' ''dir.
                boolean --> default value false'dur.
                String --> default value "null" dir.

*/
    public static void main(String[] args) {//main level
        //static int kg =99;//class level haricinde main veya başka bir metodda static class variable oluşturulamaz.->CTE
        int kg =99;//initial edilmiş local variable
        int id;//initial edilmemiş.
        //System.out.println(id);//initial edilmemiş local variable herhangi bir actiona tabi tutulamaz
        id =100;
        System.out.println("id scope içinde doğrudan call edildi : "+id);
        //System.out.println(yas);obj variable obj olmadan doğrudan call edilemez
        prLanguage ="java";
        System.out.println("prLanguage = " + prLanguage);//static olduğu için doğrudan call edilebilir.
        staticMeth();//static meth doğrudan call edildi.
        //nonStaticMeth();// doğrudan call edilemez nonstatic olduğu için.
        C01_InstanceVariable obj1 = new C01_InstanceVariable();//obj create edildi.
        obj1.nonStaticMeth();//obj yardımı ile call edildi.
        System.out.println("obj1.boy = " + obj1.boy);//instance variable obj yardımıyla call edildi.
        System.out.println("obj1.kurs = " + obj1.kurs);//bad parctice
        //obj1.id;//local variable obj yardımıyla call edilemez.
        System.out.println("id = " + id);
    }//main sonu

    public  static void staticMeth(){
        System.out.println("staticMeth run edildi");
    }

    public void nonStaticMeth(){
        System.out.println("nonStaticMeth run edildi");
    }
}//class sonu
