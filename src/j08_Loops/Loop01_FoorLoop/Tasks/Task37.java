package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {

        /*
 Type code to ask user to enter the number of row
 and print the shape below according to that number:

  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
  16 17 18 19 20 21
  */
        int toplam = 1;
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(toplam+ " ");
                toplam++;
            }
            System.out.println();

        }



    }
}

