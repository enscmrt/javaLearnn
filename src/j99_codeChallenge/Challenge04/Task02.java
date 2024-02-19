package j99_codeChallenge.Challenge04;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci kelime giriniz ");
        String firstWord = sc.next();
        System.out.print("Ikinci kelime giriniz ");
        String secondWord = sc.next();
        System.out.println("firstWord+\" \"+secondWord = " + firstWord + " " + secondWord);
        System.out.println("firstWord.concat(\" \").concat(secondWord) = " + firstWord.concat(" ").concat(secondWord));

        System.out.println("firstWord.substring(1).concat(secondWord.substring(1)) = " + firstWord.substring(1).concat(secondWord.substring(1)));


    }

}
