package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

        int sayiArr[]= {23, 44, 2, 11, 55, 60, 32, 34, 58, 22, 9, 64, 42};
        int sayi1=44;
        int sayi2 =20;
        System.out.println("amele kod!!!");
        boolean flag = false;
        for (int i = 0; i < sayiArr.length; i++) {
            if(sayiArr[i]==sayi1){
                flag =true;
                break;
            }

        }
        System.out.println(flag?"aradığınız sayı arrayda mevcut":"aradığınız sayı arrayda mevcut değil");

        System.out.println("*** cincix kod ***");
        Arrays.sort(sayiArr);
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        System.out.println("Arrays.binarySearch(sayiArr,32) = " + Arrays.binarySearch(sayiArr, 32));

    }
}
