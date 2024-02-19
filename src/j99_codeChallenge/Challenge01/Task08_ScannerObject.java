package j99_codeChallenge.Challenge01;

import java.util.Scanner;

public class Task08_ScannerObject {
    public static void main(String[] args) {

        /*
 Task->
girilenyaricap değerei için cemberin cevre ve alanını  print eden code create ediniz.

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yarıçapı giriniz = ");
        int cap = scanner.nextInt();
        System.out.println("Girilen cemberin cevresi = "+ (cap*2*3.14)+ "\nGirilen cemberin alanı ="+(cap*cap*3.14));



        
    }
}
