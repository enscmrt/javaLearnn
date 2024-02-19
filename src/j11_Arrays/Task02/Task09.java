package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz

        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[5];

        System.out.println("Lütfen 5 tane sayı giriniz:");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". sayıyı giriniz: ");
            arr1[i] = scanner.nextInt();
        }

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]+" ");
        }


    }
}
