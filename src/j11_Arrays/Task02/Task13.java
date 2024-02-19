package j11_Arrays.Task02;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

        int[] arr = new int[8];
        int count =0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println(i +1+ ". elemanı giriniz");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);


    }

}
