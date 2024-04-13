import java.util.Scanner;

public class Q40_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        int tacUzunlugu=6;
        sekilCiz(tacUzunlugu);

    }

    private static void sekilCiz(int length) {
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("^");

            }
            System.out.println();

            
        }
        int gövdeUzunlugu=5;
        for (int i = 0; i < gövdeUzunlugu; i++) {
            System.out.println("|||");
        }
    }
}



