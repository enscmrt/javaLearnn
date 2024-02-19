package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Erkek veya Kadın olarak cinsiyet giriniz: ");
        String cinsiyet = scanner.nextLine();
        if (cinsiyet.equalsIgnoreCase("Erkek")) {
            System.out.println("Lütfen Yaş giriniz: ");
            int yaş = scanner.nextInt();
            if (yaş<18) {
                System.out.println("Erkek çocuk");

            } else if (yaş>=18) {
                System.out.println("Adam");

            }
        } else if (cinsiyet.equalsIgnoreCase("Kadın")) {
            System.out.println("Lütfen Yaş giriniz: ");
            int yaş = scanner.nextInt();
            if (yaş<18) {
                System.out.println("Kız çocuk");

            } else if (yaş>=18) {
                System.out.println("Kadın");

            }

        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }


    }
}































