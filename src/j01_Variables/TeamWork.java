package j01_Variables;

import java.util.Scanner;

public class TeamWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yıl = sc.nextInt();
        if(yıl%4==0) {
            if(yıl%100==0) {
                if(yıl%400==0) {
                    System.out.println("artık yıl");
                }else{
                    System.out.println("artık yıl değildir");
                }
        }else System.out.println("artık yıl");
            }else System.out.println("artık yıl değildir");

    }
}
