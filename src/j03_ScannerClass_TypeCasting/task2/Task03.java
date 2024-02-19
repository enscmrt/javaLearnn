package j03_ScannerClass_TypeCasting.task2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac saat uyudugunuzu giriniz = ");
        double saat = scanner.nextDouble();
        System.out.println("Ayda =" + (saat*30)/24 + " yilda = "+(saat*30*12)/24+ "40 yilda = "+(saat*30*12*40)/24+ " gün uyursunuz");

        }


    }

