package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task23 {


    public static void main(String[] args) {
        /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = sc.nextInt();
        System.out.println(sayi<0 ? "|"+sayi+"| = "+Math.abs(sayi):"Sayı zaten pozitif");

    }

}
