package j99_codeChallenge.Challenge03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yas giriniz");
        int yas = scan.nextInt();
        if(yas>=18){
            if(yas<50&& yas>=18){
                System.out.println("Agam tek oy kullanma hakkın var");

            }else if(yas<70&&yas>=50){
                System.out.println("Iki kez oy kullanma hakkın var");
            }else System.out.println("Agam üç oy kullanma hakkın var");

        }else System.out.println("Agam hele büyüde gel");
        System.out.println("Agam bu satır print edildiyse kod cincix devamke");


        }// main sonu

    }