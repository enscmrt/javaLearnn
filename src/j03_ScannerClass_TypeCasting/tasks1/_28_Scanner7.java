package j03_ScannerClass_TypeCasting.tasks1;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Bir Banka Hesabınız Var mı?  Var ise True, Yok ise False yazınız.");
        boolean banka = scanner.nextBoolean();
        System.out.println("Bir Banka Hesabınız Var mı " + banka);


    }
}
