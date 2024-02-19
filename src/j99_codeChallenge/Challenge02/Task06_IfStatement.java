package j99_codeChallenge.Challenge02;

import java.util.Scanner;

public class Task06_IfStatement {
    public static void main(String[] args) {
        /*
 Task->
 Girilen not değeri için
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
            sartlari aralik belirterek print ediniz

   Girilen saat değeri için
   0 ~12 ==> good morning
12 ~ 15 ==> good afternoon
15 ~ 23 ==> good night
12 ==> good noon
print eden code create ediniz.
  */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen not giriniz:");
        int not = input.nextInt();
        if(not>=90&&not<=100){
            System.out.println("A");

        } else if (not>=80&&not<=89) {
            System.out.println("B");

        }else if (not>=70&&not<=79) {
            System.out.println("C");
        }else if (not>=60&&not<=69) {
            System.out.println("D");
        } else if (not>=0&&not<=59) {
            System.out.println("F");

        }else System.out.println("Yanlış not");

        System.out.println("Saat giriniz:");
        double saat = input.nextDouble();
        if(saat>=0&&saat<=12){
            System.out.println("good morning");

        } else if (saat>=12&&not<=15) {
            System.out.println("good");

        }else if (not>=70&&not<=79) {
            System.out.println("C");
        }else if (not>=60&&not<=69) {
            System.out.println("D");
        } else if (not>=0&&not<=59) {
            System.out.println("F");

        }else System.out.println("Yanlış not");


    }
}
