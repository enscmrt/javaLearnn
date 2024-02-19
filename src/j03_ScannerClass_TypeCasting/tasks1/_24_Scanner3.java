package j03_ScannerClass_TypeCasting.tasks1;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen sevdiğiniz bir meyve giriniz= ");
        String meyve = scanner.next();
        System.out.println("Sevdiğim meyve = " + meyve);

    }
}
