import java.util.Arrays;
import java.util.Scanner;


public class Q53_IkiboyutluArrayFaktoriyel {


    public static void main(String[] args) {
        // task-> girilen 3x3 iki boyutlu arrayin elemanlarının faktoriyelini print eden method create ediniz
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        factorial(arr);

    }

    private static void factorial(int[][] arr) {
        int fak =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               fak*=arr[i][j];
            }
            System.out.println(fak);
        }
    }
}
