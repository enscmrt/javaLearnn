package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task22 {
        public static void main(String[] args) {
        /*
                Sifreyi kontrol etmek için ternary yaziniz.
                8'den fazla karakter iceriyorsa, baş harfi 'i' olmalidir.
                8 karakterden fazla icermiyorsa, baş harfi 'K' olmalidir.
         */
                Scanner sc = new Scanner(System.in);
                System.out.println("Lutfen şifrenizi giriniz");
                String sifre = sc.nextLine();
                System.out.println(sifre.length()>8?"i"+sifre:"K"+sifre);

        }

}
