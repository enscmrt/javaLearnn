package j11_Arrays;

import java.util.Arrays;

public class C06_Arrays_CopyOfJava {
    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar
        int[] arr ={2, 15, 13, 5, 65, 49, 38, 33, 55, 27};
        int[] yeniArr = Arrays.copyOf(arr,5);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...
        int[] yeniArr2 = Arrays.copyOfRange(arr, arr.length-3, arr.length);
        System.out.println("Arrays.toString(yeniArr2) = " + Arrays.toString(yeniArr2));

        //Arrayi belirli bir eleman ile set-update etme((fill)(value))
        System.out.println("arr fii(10) öncesi:"+Arrays.toString(arr));
        Arrays.fill(arr, 10);
        System.out.println("arr fii(10) sonrası:"+Arrays.toString(arr));

        // task-> arr 3 ile 7 index arası(4-5-6) elamanları 35 ile update eden code create ediniz...
        Arrays.fill(arr,4,7,35);
        System.out.println("Arrays.toString(arr fill 3-7 arası 35 yapılması) = " + Arrays.toString(arr));

    }
}
