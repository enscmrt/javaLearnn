package j99_codeChallenge.Challenge08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
       // task-> Girilen 8 tamsayının kaçının 3 e tam boludugunu print eden  code create ediniz.
        Scanner input = new Scanner(System.in);
        int arr[]=new int[8];
        int count = 0;
        for (int i = 0; i <8 ; i++) {
            System.out.println(i+". index elemanı giriniz");
            arr[i] = input.nextInt();
            if(arr[i] %3==0){
                count++;

            }

        }
        System.out.println("count = "+count);

    }// main sonu



}// Class sonu