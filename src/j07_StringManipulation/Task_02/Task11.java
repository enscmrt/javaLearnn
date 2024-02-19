package j07_StringManipulation.Task_02;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ad soyad giriniz");
        String adSoyad = scan.nextLine();
        if(adSoyad.contains(" ")){
            System.out.println("ad= "+adSoyad.substring(0,adSoyad.indexOf(" ")));
            System.out.println("soyad="+adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.length()));

        }else System.out.println("Lütfen ad ve soyad arasında boşluk bırakınız!!!");



    }
}
