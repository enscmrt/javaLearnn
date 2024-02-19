package j02_DataType_WrapperClass;

public class C01_VariableCreate {
    /*Variable
 bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
 Variable icinde deger saklayan bir container'dir
 bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
*** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
*/
    public static void main(String[] args) {
        //variable create(değişken oluşturma) için...
        //1-Data Type(değişken türü) için...2-Variable name(değişken ismi)  '=' 3- value(değikenin değeri);
                int     selimYas    = 35;//memory'de int tipinde selimYas isminde 35 değerinde bir variable oluşturuldu.
        //1.yol -> best practice (Recommended -> Tavsiye edilen)
        int yas = 33;
        int maas = 10000;
        System.out.println(yas);
        System.out.println("yas");

        System.out.println("selimYas = " + selimYas);
        System.out.println("Enes bey maas ="+maas);

        //2.yol
        int boy;
        //System.out.println(boy);
        boy=190;
        System.out.println(boy);

        //3.yol
        int yevmiye, kilo, tecrübe;//birden çok ayni türde variable tanımlandı.
        yevmiye= 400;
        kilo= 90;
        tecrübe= 7;

        //cincix kod
        int gunluk= 550, agırlık=88, experience=10;
        System.out.println("gunluk = "+gunluk + "\n agırlık = " +agırlık +"\n tecrübe ="+ experience);

        //hataa-> öncesinden tanımlanmış bir variable yi tekrar tanımlanamaz -> CTE
        yas=58; // tanımlanmış bir variable yi tekrar tanımlandı->deger değişti.








    }
}
