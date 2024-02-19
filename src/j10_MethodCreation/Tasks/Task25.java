package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int sayi=input.nextInt();
        factoriyel(sayi);


    }

    private static void factoriyel(int sayi) {

        int faktoriyel = 1;
        for (int i = sayi; i >0 ; i--) {
            faktoriyel*=i;


        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
