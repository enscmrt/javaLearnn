package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen sıcaklık değerini giriniz");
        int temp = sc.nextInt();
        if (temp < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if (temp >= 5 && temp < 15) {
            System.out.println("Sinemaya gidebilirsin");
        } else if (temp >= 15 && temp <25) {
            System.out.println("Piknik Yapabilirsiniz");

        }else if(temp >= 25){
            System.out.println("Yüzme Yapabilirsiniz");
        }else
            System.out.println("Hatalı giriş");

    }
}
