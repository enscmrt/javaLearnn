package j99_codeChallenge.Challenge08;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
		/* task->
        verilen bir int array icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[]={2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


    }// main sonu



}// Class sonu
