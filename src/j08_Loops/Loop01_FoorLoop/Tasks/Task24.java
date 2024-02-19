package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz: ");
        String str = input.next();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
            System.out.print(str.charAt(i));
        }





    }

}
