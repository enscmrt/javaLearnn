package j11_Arrays.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int silinecekEleman = 7;

        int indexSilEleman = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == silinecekEleman) {
                indexSilEleman = i;
                break;
            }
        }

        if (indexSilEleman == -1) {
            System.out.println("Silinecek eleman bulunamadı.");
            return;
        }
        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == indexSilEleman) {
                continue;
            }
            newArray[j++] = arr[i];
        }

        System.out.println("Yeni dizi: " + Arrays.toString(newArray));


    }
}
