package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Bir sayi giriniz");
        int sayi2 = scan.nextInt();

        int toplam=0;
        for (int i = (sayi1<sayi2?sayi1:sayi2); i <(sayi1<sayi2? sayi2:sayi1); i++) {
            System.out.println(i+ " ");
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);



    }
}
