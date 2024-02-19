package j11_Arrays.Task02;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        int[] arr1={25,33,45,78,99,86,47};
        Arrays.sort(arr1);
        sırala(arr1);



    }

    private static void sırala(int[] arr1) {
        int [] arr2 = new int[arr1.length];
        int count=0;
        for (int i = arr1.length-1; i>=0; i--) {
            arr2[count] = arr1[i];
            count++;
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }
}
