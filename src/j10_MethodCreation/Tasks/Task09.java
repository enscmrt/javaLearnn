package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Saati giriniz");
        int saat = input.nextInt();
        int saniye =1;
        cevirici(saat, saniye);



    }//main sonu

    private static void cevirici(int saat, int saniye) {

        System.out.println("Girdiğiniz saatin saniye cinsinden değeri="+(saat*3600));
    }

}// Class sonu
