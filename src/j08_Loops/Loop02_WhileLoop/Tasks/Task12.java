package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String metin = scan.nextLine().replace(" ","");
        int harfSayısı = 0;
        int rakamSayısı =0;
        int karakterSayısı =0;
        int index =0;

        do {
            if(metin.isEmpty()){
                System.out.println("Bir metin giriniz");

            } else if (Character.isDigit(metin.charAt(index))) {
                rakamSayısı++;

            } else if (Character.isLetter(metin.charAt(index))) {
                harfSayısı++;

            }else {
                karakterSayısı++;
            }
            index++;

        }while (index<=metin.length()-1);

        System.out.println("Harf sayısı: "+harfSayısı);
        System.out.println("Rakam sayısı: "+rakamSayısı);
        System.out.println("Karakter sayısı: "+karakterSayısı);


        //2.yol
        String rakam=metin.replaceAll("[^0-9]","");
        String harf=metin.replaceAll("[^a-zA-Z]","");
        String karakter=metin.replaceAll("\\w","");
        if (metin.isEmpty()){
            System.out.println("Bir metin giriniz");
        }
        System.out.println("karakter sayisi= " + karakter.length());
        System.out.println("harf sayisi = " + harf.length());
        System.out.println("rakam sayisi = " + rakam.length());
     }

}
