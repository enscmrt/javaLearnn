package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    /*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
   */
    public static void main(String[] args) {
        boolean basarili= true;
        System.out.println("basarili = "+ basarili);//true
        String success = String.valueOf(basarili);//wrapper class
        System.out.println("success = " + success);

        double sayi1 = 49;
        System.out.println("sayi1 = " + sayi1);
        int sayi2 =74;
        int sayi3 = 12;
        System.out.println("sayi2 / sayi3 = " + (sayi2/sayi3));

        byte b= 15;
        int num = b;
        System.out.println("num = " + num);//15
        int i =1453;
        double d =i;
        System.out.println("d = " + d);
        double d1 =d/sayi2;
        System.out.println("d1 = " + d1);
        //Hap bilgi -> İki farklı datatype işleme girerse AW(küçük data büyük dataya çevrilir.)
        // veri kaybını önlemek için yapılır.
        double d2 = 14.53;
        System.out.println("d2 = " + d2);
        int num2 = (int) d2;// Explicit narrowing işlemi yapılıyor. Büyük küçüğe çevriliyor.
        System.out.println("num2 = " + num2);//14
        double d3 = 571.622;
        System.out.println("d3 = " + d3);//571.622
        long l = (long) d3;
        System.out.println("l = " + l);//571

        int num3 = 129;
        System.out.println("num3 = " + num3);
        byte b2 = (byte) num3;
        System.out.println("b2 = " + b2);






    }

}
