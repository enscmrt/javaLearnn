package j02_DataType_WrapperClass;

public class C04_WrapperClass {
    /*
       Note: Java primitive lere method'lar ekleyerek yeni bir
             yapi olusturdu, bu yapiya "Wrapper Class"
             Primitive         Wrapper
                byte     ==>    Byte
                short    ==>    Short
                ** int   ==>    Integer
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                ** char  ==>    Character
    */
    public static void main(String[] args) {
       /*
       Java da bir değişkenin data type için getClass() metodu kullanılır. Bu method o nesnenin hangi class tan üretildiyse onu verir.

        */
        String str = "JavaCAN";
        int yas = 45;
        double pi = 3.14;
        System.out.println(str.getClass());
       // System.out.println(yas.getClass());//CTE yas primitive olduğu için classi yoktur.//
        /*
        Integer.valueOf(yas) veya Double.valueOf(pi) ifadeleri kullanılarak Wrapper classa dönüştürülür. getclass metodu kullanılır.

         */

        String isim = "Safvet";
        System.out.println("isim = " + isim);
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());
        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */
// task-> id ve tc String değerlerini toplamını print code create ediniz..
        String id="12345";
        String tc="1234567";
        System.out.println(id+tc);//123451234567
        Integer yeniID=Integer.valueOf(id);//String olan id integer'e cevrildi
        System.out.println("yeniID = " + yeniID);
        Integer yeniTC=Integer.valueOf(tc);//String olan tc integer'e cevrildi
        System.out.println("yeniTC = " + yeniTC);
        System.out.println("Toplam = "+(yeniID+yeniTC));

        String okulNo= "3435a";
        //int okulNosu = 3435a// CTE
       // int yeniOkulNo = Integer.parseInt(okulNo);//okulNo integere atandı->Run time exception
      //  System.out.println(yeniOkulNo);

        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.

            Byte bytMaxDeger= Byte.MAX_VALUE;
            Byte bytMinDeger= Byte.MIN_VALUE;
        System.out.println("bytMinDeger = " + bytMinDeger);
        System.out.println("bytMaxDeger = " + bytMaxDeger);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);




        




    }
}

