package j11_Arrays.Task01;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

       int sayı =123;
        /*int yeniSayı=0;
        for (int i = sayı; i > 0; i /= 10) {
            yeniSayı = yeniSayı * 10 + i % 10;
        }
        System.out.println("yeniSayı = " + yeniSayı);*/

        String str = String.valueOf(sayı);
        String arr[]= {str};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(str.toCharArray()));
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }



    }
}


