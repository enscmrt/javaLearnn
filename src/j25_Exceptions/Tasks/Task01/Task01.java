package j25_Exceptions.Tasks.Task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
  Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen password giriniz: ");
        String password = input.nextLine();
        try {
            if (password.length() < 6 || password.length() > 10) {
                throw new IllegalArgumentException("Lütfen 6 ile 10 karakter arasında giriniz");
            }else System.out.println("Sİfreniz gecerlidir.");
        }catch (IllegalArgumentException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }




    }
}
