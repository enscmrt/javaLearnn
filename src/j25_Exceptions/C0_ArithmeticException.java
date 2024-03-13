package j25_Exceptions;

import java.util.Scanner;

public class C0_ArithmeticException {

    public static void main(String[] args) {
        //  ArithmeticException -> matematksel(Arithmetic) işlemlerde olusan Run Time Exception type'dir.

        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        //int bolum=sayi1/sayi2;
        //System.out.println("bolum = " + bolum);
        try {//dener->hatanın(exception) olma ihtimali olan action blok ->benzin depo kontrolü
            System.out.println("try block run edildi");
            System.out.println(sayi1/sayi2);//emin olunmayan denemesi gereken action komut
            System.out.println("try bloktan selamlar");
            /*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
   aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

 */

        }catch (ArithmeticException e){//yakala-ztry blokta denenen istisnai durum gerçekleşirse yapılması gereken handling ->action
            System.out.println("catch block run edildi");
            System.out.println("Hiç bölen sayı 0 olurmu"+e.getMessage());//exception mesajı print edilir.
           e.printStackTrace();//exc. tum cıktıyı print eder.
            System.out.println("catch bloktan selamlar");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2.catch block run edildi");
            System.out.println("2.catch bloktan selamlar");

        }catch (Exception e){
            System.out.println("Hz Adem catch block run edildi");
            System.out.println("Hz Adem  bloktan selamlar");

        }finally {//ne yaparsan yap sonunda bunu yap. catch bloklardan sonra mutlaka çalışması istenen aksiyonlsr için tsnımlsır.Kontağı kapat
            System.out.println("finally bloktan selamlar");
            /*
       try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
       hata alınır ama finaly tanımlanırsa catch çalışmasa bile
       pr akışı devam eder.finally block hata olsa da olmasa da calışır.
       Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
       başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
        */
        }
        System.out.println("eğer bu mesajı okuduysan app sorunsuz çalışıyor");

    }
}
