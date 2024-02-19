package j07_StringManipulation;

public class C02_Length {
    public static void main(String[] args) {
        /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
        String str1 = "Hayattan bir saat calmak:)";
        System.out.println("str1.length() = " + str1.length());
        String str2 = " ";
        String str3 = "";
        String str4 = null;
        System.out.println("str2.length() = " + str2.length());
        System.out.println("str3.length() = " + str3.length());
        System.out.println("str4.length() = " + str4.length());
        /*
        Hap bilgi-> null atanan String variable herhangi bir mrthod call etmez
        null->case sensitive NULL !=null!=Null
        null-> dutluk: arsa değeri olmayan arazi sadece hiçliği gösteren pointer(işaretçi)
         */
        String str5; //Tanımlanmış ama değer atanmamış boş variable kutu



    }
}
