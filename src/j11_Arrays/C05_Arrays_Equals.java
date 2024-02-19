package j11_Arrays;

import java.util.Arrays;

public class C05_Arrays_Equals {
    public static void main(String[] args) {
// Arrays.equals(arr1,arr2);-> girilen iki arrayin index ve eleman value kontrolu yapar true false return eder

        int arr1[] = {2, 5, 13, 65, 49, 38, 33, 58, 27};
        int arr2[] = {21, 52, 14, 63, 49, 31, 35, 53, 26};

        System.out.println("Arr1 Arr2 ye eşit mi :"+ Arrays.equals(arr1, arr2));
        System.out.println("arr1[3]==arr2[3] = " + (arr1[3] == arr2[3]));
        System.out.println("arr1[4]==arr2[4] = " + (arr1[4] == arr2[4]));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arr1 Arr2 ye eşit mi :"+ Arrays.equals(arr1, arr2));

        //Arrayi stringe çevirme
        String str =Arrays.toString(arr1);
        System.out.println(str);
        System.out.println("str.substring(5) = " + str.substring(5));

    }
}
