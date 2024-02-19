package j05_İfStatementTernaryOperator.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        Random random =new Random();
        System.out.println("Taş-Kağıt-Makas Oyununa Hoşgeldiniz:)");
        System.out.println("Taş için 'T', \nKağıt için 'K', \nMakas için 'M' \ngiriniz");
        char secim=scan.next().charAt(0);
        int pcSecim= random.nextInt(3)+1;
        System.out.println("Bilgisayar seçimi : " + pcSecim);
        if(secim==pcSecim){
            System.out.println("BERABERE");
        }else if((secim=='T'&&pcSecim=='M')||(secim=='K'&&pcSecim=='T')||(secim=='M'&&pcSecim=='K')){
            System.out.println("Kazandınız");


        } else
            System.out.println("Kaybettiniz");

        }







    }

