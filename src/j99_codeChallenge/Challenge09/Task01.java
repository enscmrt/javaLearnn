package j99_codeChallenge.Challenge09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         * Task ->  Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array'de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         *
         *
         */
        int array[]={3,5,21,32,34,45,56,57,76,87,95};

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        System.out.println("controlSayi(sayi, array) = " + controlSayi(sayi, array));

    }//main sonu

    private static String controlSayi(int sayi, int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if(sayi==arr[i]){
                return  "Arrayde mevcut";
            }


        }
        return "Arrayde mevcut değil";
    }


}//class sonu
