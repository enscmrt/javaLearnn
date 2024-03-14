package j25_Exceptions;

public class NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String variable length() meth call edildiğinde oluşan RTE
        String str1 ="";
        System.out.println("str1.length() = " + (str1.length()));
        String str2=null;
        System.out.println("str2.length() = " + str2.length());

        try {
            System.out.println("str2.length() = " + str2.length());
            System.out.println("Try blok sorunsuz çalıştı");

        }catch (java.lang.NullPointerException e){

            System.out.println("Try blok exc fırlattı haberin var mı");
            System.out.println("Bu mesajı okuyorsan catch blok calıştı");



        }
        System.out.println();

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("Try blok sorunsuz çalıştı");

        }catch (java.lang.NullPointerException e){

            System.out.println("Try blok exc fırlattı haberin var mı");
            System.out.println("Bu mesajı okuyorsan catch blok calıştı");



        }

        System.out.println("Bu çıktıyı okuyorsan kod çalışıyordur");


    }
}
