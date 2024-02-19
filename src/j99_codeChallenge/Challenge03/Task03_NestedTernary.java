package j99_codeChallenge.Challenge03;

import java.util.Locale;
import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen final giriniz");
        char finalChar = scan.next().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println(finalChar == 'A' ? "Gayet Basarili" :
                (finalChar == 'B' ? "Basarili" :
                        (finalChar == 'C' ? "Ha gayret" : "Digerleri")));

    }

}
