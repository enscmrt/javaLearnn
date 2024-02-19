package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        /* indexOf()->aranan yolcunun koltuk numarasını verir
  char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
  Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/
        String string= "Madem geldin dünyaya çalış java'ya";
        System.out.println("string.indexOf('y') = " + string.indexOf('y'));
        System.out.println("string.indexOf(\"e\") = " + string.indexOf("e"));
        //Metinden bir kelimenin indexi arandığı zaman ilk bulduğu indexi return eder
        System.out.println("string.indexOf(\"java\") = " + string.indexOf("java"));
        System.out.println("string.indexOf(\"JAVA\") = " + string.indexOf("JAVA"));
        System.out.println("string.indexOf(\"a\",12) = " + string.indexOf("a", 12));

        /* lastIndexOf()
String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
indexOf un sondan olan hali fakat index numaraları değişmez.
lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
*/
        System.out.println("string.lastIndexOf(\"a\") = " + string.lastIndexOf("a"));
        System.out.println("string.lastIndexOf('x') = " + string.lastIndexOf('x'));
        System.out.println("string.lastIndexOf('s') = " + string.lastIndexOf('s'));

        /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine().toLowerCase();
        if(!metin.contains("java")){
            System.out.println("Girilen metin java içermiyor");

        }else if(metin.indexOf("java")==metin.lastIndexOf("java")){
            System.out.println("Java bir defa kullanılmış");

        }else System.out.println("Girilen ifade birden fazla java içeriyor");



    }
}
