package j11_Arrays.Task01;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";
        str.replace("$","");
        int toplam =0;
        String arr[] =str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            toplam += Integer.parseInt(arr[i].replace("$",""));
        }
        System.out.println("toplam = " + toplam);


    }
}