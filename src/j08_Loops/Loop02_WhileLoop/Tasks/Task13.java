package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */

        Scanner scan = new Scanner(System.in);
        boolean kosul = true;

        do {
            System.out.println("Karakter giriniz");
            char karakter = scan.next().charAt(0);
            if(karakter!='x'&&karakter!='X'){
                System.out.println("javaCAN");
            }else {
                System.out.println("javaTAR");
                kosul = false;
            }

        }while (kosul);


    }
}
