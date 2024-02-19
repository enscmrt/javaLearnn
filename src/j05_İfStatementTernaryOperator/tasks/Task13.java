package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi (+, -, *, /) bir tanesini seçiniz: ");
        char islem =scanner.next().charAt(0);
        double sonuc =0;
        if(islem =='+' ){
            System.out.println(sonuc=sayi1+sayi2);

        } else if (islem =='-') {
            System.out.println( sonuc=sayi1-sayi2);

        }else if (islem=='*'){
            System.out.println(sonuc=sayi1*sayi2);

        } else if (islem=='/') {
            System.out.println(sonuc=sayi1/sayi2);

        }else
            System.out.println("Lütfen geçerli bir işlemi seçiniz");


    }
}
