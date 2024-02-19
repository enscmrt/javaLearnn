package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("100den küçük bir sayı giriniz");
        int sayi = scan.nextInt();
        if(sayi>100||sayi<0){
            System.out.println("Bu sayı kabul edilmedi!!!");
        }else {
            for (int i = 1; i <=sayi ; i++) {
                if(i%3==0&&i%5==0){
                    System.out.println("JavaCAN");
                } else if (i%3==0) {
                    System.out.println("Java");

                } else if (i%5==0) {
                    System.out.println("CAN'dır");

                }else System.out.println(i+" ");

            }
        }



    }
}
