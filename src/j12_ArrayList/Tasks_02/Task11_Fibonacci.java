package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fibonacci için pozitif bir sayı giriniz:");
        int sayi = input.nextInt();
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 2; i < sayi; i++) {
            fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
        }
        System.out.println(fibonacci);





    }
}
