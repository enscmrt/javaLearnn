package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int onlarBasamağı= (sayi/10)%10;
        if (sayi>=10){
            switch (onlarBasamağı){
                case 0: System.out.print(""); break;
                case 1: System.out.print("bir"); break;
                case 2: System.out.print("iki"); break;
                case 3: System.out.print("üç "); break;
                case 4: System.out.print("dört "); break;
                case 5: System.out.print("beş "); break;
                case 6: System.out.print("altı "); break;
                case 7: System.out.print("yedi "); break;
                case 8: System.out.print("sekiz "); break;
                case 9: System.out.print("dokuz "); break;
                default: System.out.println("Lütfen geçerli bir sayı giriniz");
            }

        }else
            System.out.println("Lütfen en az iki basamaklı bir sayı giriniz");


    }
}
