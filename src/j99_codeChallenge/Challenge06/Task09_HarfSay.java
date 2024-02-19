package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task-> Girilen bir metinde istenen bir harfin tekrar sayısını print eden code create ediniz

     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = input.nextLine();
        System.out.println("Hangi harfi yazdırmak istersiniz");
        char harf = input.next().charAt(0);
        int harfSayısı =0;
        for (int i = 0; i <metin.length() ; i++) {
            if(metin.charAt(i) == harf){
                harfSayısı ++;
            }

        }
        System.out.println("Girilen metindeki istenen harf"+harf+harfSayısı+"defa kullanılmıştır");

    }


}
