package j99_codeChallenge.Challenge05;

import java.util.Scanner;

public class Task05 {
    /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {


        System.out.println("Satır sayısı giriniz:");
        Scanner input = new Scanner(System.in);
        int satir = input.nextInt();
        System.out.println("Sütun giriniz:");
        int sutun = input.nextInt();
        for (int kat = 1; kat <=satir; kat++) {
            for (int daire = 0; daire <=sutun ; daire++) {
                System.out.print("* ");
            }
            System.out.println();

        }



    }


}
