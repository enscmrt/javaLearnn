package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir character giriniz: ");
        char input = scanner.next().charAt(0);
        //int charDegeri = input;
        //System.out.println("Girdiğiniz"+input+"karakterin ascii değeri:"+charDegeri);
        System.out.println(input+0);




    }


}
