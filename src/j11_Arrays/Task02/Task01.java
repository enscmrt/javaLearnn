package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int boyut = scanner.nextInt();
        int[] arr = new int[boyut];
        System.out.println("Lutfen array elemanlarını giriniz");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

        }
            Arrays.sort(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");

            }



    }
}
