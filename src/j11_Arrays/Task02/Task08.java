package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        int[] arr1={7,25,13,98,51,42,28,87,68};
        int[] arr2=new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2== 1) {
                arr2[i] = arr1[i];
            }
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));

    }
}
