package j11_Arrays.Task01;

import java.util.Arrays;

public class _02_Create_array2 {

    public static void main(String[] args) {

    /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        // Kodu aşağıya yazınız..

        int arr[]  = {13, 15, 14, 16, 16};
        int arr1[]  = {13, 15, 14, 16, 16};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println(arr==arr1);
        System.out.println("Arrays.equals(arr, arr1) = " + Arrays.equals(arr, arr1));
        System.out.println("arr.equals(arr1) = " + arr.equals(arr1));

        int[] dizi = {1, 2, 3, 4, 5};
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));


    }
}