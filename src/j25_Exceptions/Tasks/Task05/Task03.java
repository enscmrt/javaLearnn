package j25_Exceptions.Tasks.Task05;

public class Task03 {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.

        randomSayi();

    }

    private static void randomSayi() {
        int random1 =5;
        int random2 =4;
        int random3=random1+random2;
        System.out.println("random3 = " + random3);
        if(random3<12){
            try {
                throw new IllegalArgumentException("Sayı 12'den küçük ise hata verir");
            }catch (IllegalArgumentException e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }

        }



    }
}
