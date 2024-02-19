package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir meyil giriniz");
        String meyil = scan.nextLine();
        kontrolmeyil (meyil);


    }//main sonu

    public static boolean kontrolmeyil(String meyil) {
       boolean dogrumu = false;
       if(meyil.contains(".")&&meyil.contains("@")&&!(meyil.startsWith("@")));
       dogrumu = true;
return dogrumu;
    }


}//Class sonu
