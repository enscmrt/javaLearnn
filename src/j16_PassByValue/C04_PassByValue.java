package j16_PassByValue;

public class C04_PassByValue {
    static double etiketFiyatı;//gökteki güneş variable->Class level her meth erişimi olan idouble type tanımlandı
    static double indirimOranı;
    public static void main(String[] args) {
        /*
eger bir method'a yapılan değişiklik kalıcı olsun istenirse
1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
 */
        etiketFiyatı=100;
        indirimOranı=0.1;
        System.out.println("indirim öncesi etiket fiyatı : "+etiketFiyatı);
        indirim();
        System.out.println("indirim sonrası etiket fiyatı : "+etiketFiyatı);

    }

    private static void indirim() {
        etiketFiyatı*=(1-indirimOranı);//güneş variable 0.9 ile çarpıldı kalıcı makyaj yapıldı.
        System.out.println("indirilmiş etiket fiyatı : "+etiketFiyatı);
    }
}
