package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) throws ClassCastException{//unchecked exc throws exce handle edemez rte exc try catch kullanılır.
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE

        Object obj ="Javacan'lara selam";
        System.out.println("obj = " + obj);
        String str = (String) obj;
        System.out.println("str = " + str);
        Object sayi =49;
       // String sayiStr = (String) sayi;

        try {
            String sayiStr = (String) sayi;
            System.out.println("Try bloktan selamlar bu mesajı okuyorsan try sorunsuz calısti. Catch blok calısmadı.");

        }catch (ClassCastException e){
            System.out.println("int data type stringe dönüştürülemez.");
            System.out.println("Buu mesajı okuyorsan try exc yakaladı");

        }
        System.out.println();
        try {
            String str1 = (String) obj;
            System.out.println("str1 = " + str1);
            System.out.println("Try bloktan selamlar bu mesajı okuyorsan try sorunsuz calısti. Catch blok calısmadı.");

        }catch (ClassCastException e){
            System.out.println("int data type stringe dönüştürülemez.");
            System.out.println("Buu mesajı okuyorsan try exc yakaladı");

        }
        System.out.println("app sorunsuz calısır");

    }


}
