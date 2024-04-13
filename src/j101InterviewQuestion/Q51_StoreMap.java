import java.util.*;

public class Q51_StoreMap {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("TC Kimlik numaranızın son dört hanesini giriniz");
        String tc = scanner.nextLine();
        System.out.println("Adınızı ve Soyadınızı giriniz");
        String adSoyad = scanner.nextLine();
        System.out.println("Adresinizi giriniz");
        String adres = scanner.nextLine();
        System.out.println("Telefon numarası giriniz");
        String telefon = scanner.nextLine();
        ArrayList<String>ls=new ArrayList<String>();
        ls.add(adSoyad);
        ls.add(adres);
        ls.add(telefon);
        Map<String, ArrayList<String>> kisiler = new HashMap<String, ArrayList<String>>();
        kisiler.put(tc, ls);
        System.out.println(kisiler.get(tc));



    }


}