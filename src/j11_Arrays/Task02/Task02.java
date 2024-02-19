package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int boyut = scanner.nextInt();
        int[] arr = new int[boyut];
        int toplam =0;
        System.out.println("Lutfen array elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            toplam+=arr[i];

        }
        System.out.println("toplam = " + toplam);


    }
}
