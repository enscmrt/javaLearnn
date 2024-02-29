package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

        List<Integer> listSayi = new ArrayList<>(); // ardışık elemanların toplamlarını depolamak icin olusturuldu
        int baslama = 0;

        for (int i = 0; i < arr.length;) { // burada i degiskenini ic forun calisma durumuna gore sayac ile asagida artiriyoruz.

            int sayac = 0;
            int toplam1 = 0;

            // içteki döngü, i indisinden başlayarak, baslama değişkeninin değeri kadar ardışık elemanlari kontrol eder
            //  ve indisinden başlayarak, baslama değişkeninin değeri kadar ardışık elemanı toplam1`e ekler
            for (int j = i; j <= ((i + baslama) < arr.length - 1 ? i + baslama : arr.length - 1); j++) { // (Math.min((i + baslama), arr.length - 1))
                toplam1 += arr[j];
                sayac++;
            }
            listSayi.add(toplam1);
            baslama++;
            i += sayac;
        }

        System.out.println(listSayi);



    }


}

