package j10_MethodCreation;

public class C03_MethodDepo {
    //her classta main metod tanımlama zorunlulugu yoktur.Belirli aksiyonlar için özel classlar tanımlanır.

    public static void gecmeNotu(int not){
        if(not>=85){
            System.out.println("Takdir belgesi kazandınız");
        } else if (not>=70) {
            System.out.println("Teşekkür belgesi kazandınız");

        } else if (not>=50) {
            System.out.println("Tekrar dene");

        }else {
            System.out.println("MEB izin vermese sınıfıda gecemezdin");
        }
    }
}
