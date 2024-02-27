package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.
        */

        int[]arr=new int[6];
        tekEleman(arr);

    }//main sonu

    private static void tekEleman(int[] arr) {
        int[]arr2=new int[arr.length];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+". index elemanı giriniz");
            arr[i] = scan.nextInt();

            if(arr[i]%2==1){
                arr2[i]+=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr2));
    }


}
