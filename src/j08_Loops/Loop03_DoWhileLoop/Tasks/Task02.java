package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char baslangic = input.next().charAt(0);
        System.out.println("Lütfen ikinci karakter giriniz");
        char bitis = input.next().charAt(0);

        if(baslangic<bitis){
            do {
                System.out.println(baslangic+" ");
                baslangic++;

            }while (baslangic<=bitis);
        }else {
            do {
                System.out.println(bitis+" ");
                bitis++;

            }while (baslangic<=bitis);

        }

       /* Scanner sc =new Scanner(System.in);
        System.out.print("1.karakteri giriniz : ");
        char ch=sc.next().charAt(0);
        System.out.print("2.karakteri giriniz : ");
        char ch2=sc.next().charAt(0);
        char num= (char) Math.min(ch,ch2);
        do {
            System.out.print(num+" ");
            num++;
        }while (num<=Math.max(ch,ch2));*/



    }
}
