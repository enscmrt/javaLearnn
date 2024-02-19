package j99_codeChallenge.Challenge04;

import java.util.Scanner;

public class Task07 {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String giriniz ");
        String string = input.next();
        if (string.contains("xyz")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("   ***  ternary cozum   ***   ");

        System.out.println(string.contains("xyz") ? true : false);





    }




}
