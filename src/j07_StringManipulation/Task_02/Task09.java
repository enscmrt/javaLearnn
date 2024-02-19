package j07_StringManipulation.Task_02;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();
        if(metin.length()%2==0){
            System.out.println(metin.substring(0,metin.length()/2));

        }else
            System.out.println("Karakter sayısı ikinin katı bir metin giriniz");







    }
}
