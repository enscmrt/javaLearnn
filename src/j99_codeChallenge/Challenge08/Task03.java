package j99_codeChallenge.Challenge08;


import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  arrayi "ByeSiri" ye ceviren code create ediniz )
         */
        // 1. yol-> cincix code

        String str ="HeySiri";
        System.out.println("str.replace(\"Hey\", \"Bye\") = " + str.replace("Hey", "Bye"));

        String strArr[]= str.split("y");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        strArr[0]="Bye";
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        System.out.println("strArr[0]+strArr[1] = " + strArr[0] + strArr[1]);


    }// main sonu



}// Class sonu