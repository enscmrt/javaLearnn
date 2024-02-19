package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz: ");
        char character = scanner.next().charAt(0);
        if((character>='A'&&character<='Z')||(character>='a'&&character<='z')){
            System.out.println("Girilen karakter harftir");

        } else
            System.out.println("Girilen karakter harf değildir");

        }

    }

