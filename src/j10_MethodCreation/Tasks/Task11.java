package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ifade giriniz");
        String str = scan.nextLine();

        hackerDili(str);


    }//main sonu

    public static void hackerDili(String str) {
        String yeni = str.replaceAll("a","7").replaceAll("v","1")
                .replaceAll("c","-4").replaceAll("e","2");

        System.out.println(yeni);
    }



}//Class sonu
