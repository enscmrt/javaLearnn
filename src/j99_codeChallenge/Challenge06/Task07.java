package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini boşluk " " ve a harfi hariç  alt alta olacak
    // sekilde print eden code create ediniz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String s = input.nextLine();

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == ' '||s.charAt(i) == 'a'){
                continue;
            }
            System.out.println("s.charAt(i) = " + s.charAt(i));
        }





    }

}
