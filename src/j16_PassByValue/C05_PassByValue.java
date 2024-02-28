package j16_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
 eger bir method'a yapılan değişiklik kalıcı olsun istenirse
2 .değişklik  yapılan variable'lar atama tanımlanır.
  */
        double etiketFiyati = 100;
        double indirimOrani= 0.1;
        System.out.println("indirim öncesi etiket Fiyati"+etiketFiyati);
        etiketFiyati=indir(etiketFiyati,indirimOrani);
        System.out.println("indirim sonrası etiket fiyatı : "+etiketFiyati);

    }

    private static double indir(double etiketFiyati, double indirimOrani) {
        return etiketFiyati *(1-indirimOrani);
    }
}
