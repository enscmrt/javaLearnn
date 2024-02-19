package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        String sayi = scan.next();
        String[]arr1=sayi.split("");
        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i]);
        }


    }

}
