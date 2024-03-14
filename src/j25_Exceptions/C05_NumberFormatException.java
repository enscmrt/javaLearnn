package j25_Exceptions;

public class C05_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE

        String str1 ="1234567";
        System.out.println("str1 = " + str1);
        System.out.println("str1+28 = " + (str1 + 28));//123456728
        int sayi = Integer.parseInt(str1);
        System.out.println("sayi = " + sayi);
        System.out.println("sayi+28 = " + (sayi + 28));
        String id= "12345l678";
        //int invalidId=Integer.parseInt(id);
        //System.out.println("invalidId = " + invalidId);
        int invalidId;
        try {
            invalidId=Integer.parseInt(id);
            System.out.println("Bu mesajı okuyorsan try sorunsuz calıstı");

        }catch (NumberFormatException e){
            id ="123451678";
            invalidId =Integer.parseInt(id);
            System.out.println("gercek id = "+invalidId);
            System.out.println("try exc fırlattı catch blok run oldu");


        }
        System.out.println("app sorunsuz calıstı");

    }
}
