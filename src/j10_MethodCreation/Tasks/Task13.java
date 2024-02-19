package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci ifade giriniz");
        String str1 = scan.nextLine();
        System.out.println("İkinci ifade giriniz");
        String str2 = scan.nextLine();
        System.out.println("esitMi(str1, str2) = " + esitMi(str1, str2));


    }//main sonu

    private static boolean esitMi(String str1, String str2) {
        boolean esit = false;
        if(str1.endsWith(str2)||(str2.endsWith(str1))){
            esit = true;
        }else {
            esit = false;
        }


        return esit;
    }





}//Class sonu
