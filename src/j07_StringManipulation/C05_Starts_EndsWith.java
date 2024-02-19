package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
/*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/

        String str1="ebikGabik";
        System.out.println("str1 = " + str1);
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));
        String str2="ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));
        System.out.println("str2.endsWith(str2) = " + str2.endsWith(str2));
        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1));
        System.out.println("str1.startsWith(\"k\",3) = " + str1.startsWith("k", 3));

        //Task-> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
// @gmail.com ile  bitiyorsa "hesabınız onaylandı"  print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir e-mail giriniz:");
        String email = scanner.nextLine();
        if(email.endsWith("@gmail.com")){
            System.out.println("Girilen e-mail hesabınız onaylandı");

        }else
            System.out.println("lütfen gmail hesabı giriniz");

        }




    }
