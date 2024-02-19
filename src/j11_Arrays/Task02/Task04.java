package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz");
        int boyut = scanner.nextInt();
        int[] arr = new int[boyut];
        double toplam =0;

        System.out.println("Lutfen array elemanlarını giriniz");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            toplam+=arr[i];

            }
        int count=0;
        double ort =toplam/boyut;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ort)
                count++;

        }
        System.out.println("count = " + count);


    }
}
