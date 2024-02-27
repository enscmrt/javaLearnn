package j11_Arrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("agam bir metin gir : ");//hayat java ile cok kolay
        String metin = scan.nextLine();
        String []arr1=metin.split("");
        int maxCount=0;
        int count =0;
        String enCok="";
        for (int i = 0; i < arr1.length; i++) {
            count=0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[i].equals(arr1[j])){
                    count++;

                }
            }
            if(maxCount<count){
                maxCount=count;
                enCok=arr1[i];
            }


        }System.out.println("maxCount = " + maxCount);
        System.out.println("enCok = " + enCok);

    }
}

