package j11_Arrays.Task01;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı
         */

        String str ="Hello World";
        String str1 = "";
        String[] arr = str.split("");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            str1 += arr[i];
        }
        System.out.println(str1);






    }
}