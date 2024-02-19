package j99_codeChallenge.Challenge07;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam cm gireceksen : ");
        double cm = input.nextInt();
        System.out.println("kmConvert(cm) = " + kmConvert(cm));
        System.out.println("mConvert(cm) = " + mConvert(cm));


    }//main sonu

    private static double mConvert(double cm) {
        return cm / 100;
    }

    private static double kmConvert(double cm) {
        return cm / 10000;
    }
}//class sonu