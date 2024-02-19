package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {

        String str = "aabbcccccddddaaa";
        String yeniStr ="";
        for (int i = 0; i < str.length(); i++) {
            if(!yeniStr.contains(str.substring(i,i+1))){
                yeniStr+=str.charAt(i);

            }

        }
        System.out.println("yeniStr = " + yeniStr);

    }
}
