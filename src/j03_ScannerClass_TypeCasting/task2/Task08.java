package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize1 giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.println("Vize2 giriniz: ");
        int vize2 = scanner.nextInt();
        System.out.println("Final giriniz: ");
        int finalNot = scanner.nextInt();
        int vizeOrtalama = (vize1+vize2)/2;
        double gecmeNotu = ((vizeOrtalama*0.3+finalNot*0.7)/2);
        System.out.println("Gecme Notu: " +gecmeNotu);


    }
}
