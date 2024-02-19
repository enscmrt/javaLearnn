package j11_Arrays.Task01;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int arr[]  = {25, 30, 30, 35, 100};
        int arrToplam=0;
        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println(arrToplam);


    }
}