package j11_Arrays.Task02;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int [] arr1= {7,-5,13,-36,17,-99,47,-87};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]*=-1;

        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

    }
}
