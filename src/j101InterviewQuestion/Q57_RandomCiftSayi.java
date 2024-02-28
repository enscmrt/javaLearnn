public class Q57_RandomCiftSayi {

    public static void main(String[] args) {
        //task->0-20 arasında  Math.random() kullanarak cikan sayinin cift ya da tek olmasını kontrol eden code create ediniz
        // Math.random()*((max-min)+1)+min); -> max ile min arası rastgele sayı ureten komut

       int min =0;
       int max =20;
       int rastgeleSayi = (int)(Math.random()*(max-min)+min);
       System.out.println(rastgeleSayi);
       if (rastgeleSayi%2==0){
           System.out.println("cift sayi");

       }else {
           System.out.println("tek sayi");
       }



    }
}
