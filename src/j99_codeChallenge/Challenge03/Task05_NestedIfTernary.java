package j99_codeChallenge.Challenge03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        String translate = "";

        if (number >= 0 && number <= 9) {
            if (number == 0) translate = "Zero";
            if (number == 1) translate = "One";
            if (number == 2) translate = "Two";
            if (number == 3) translate = "Three";
            if (number == 4) translate = "Four";
            if (number == 5) translate = "Five";
            if (number == 6) translate = "Six";
            if (number == 7) translate = "Seven";
            if (number == 8) translate = "Eight";
            if (number == 9) translate = "Nine";
            System.out.println(translate);
        }else System.out.println("Invalid number");

        if (number>=0&&number<=9) {
            System.out.println(number==0?"Zero":number==1?"One":number==2?"Two":number==3?"Three":number==4?"Four":number==5?"Five"
                    :number==6?"Six":number==7?"Seven":number==8?"Eight":number==9?"Nine":"Geçersiz");
        }

    }// main sonu
}
