package j99_codeChallenge.Challenge04;

import java.util.Scanner;

public class Task09 {
    /* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("kelime giriniz ");
        String kelime = input.next();
        if(kelime.length()%2==1&&kelime.length()>=3){
            System.out.println(kelime.charAt(kelime.length()/2));

        }else System.out.println("Uygun bir kelime giriniz.");


    }
}
