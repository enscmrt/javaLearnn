package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenar uzunlugunu giriniz: ");
        int birinciKenar = scanner.nextInt();
        System.out.println("2. Kenar uzunlugunu giriniz: ");
        int icinciKenar = scanner.nextInt();
        System.out.println("3. Kenar uzunlugunu giriniz: ");
        int ucuncuKenar = scanner.nextInt();
        if (birinciKenar == icinciKenar&&birinciKenar==ucuncuKenar){
            System.out.println("Eşkenar üçgen");
        }else if(birinciKenar==icinciKenar&&birinciKenar!=ucuncuKenar){
                System.out.println("Ikizkenar üçgen");

            }else {
                System.out.println("Çeşitkenar üçgen");
            }




    }


}
