package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("İsminizi giriniz");
		String isim= scan.nextLine();
		char ilkHarf=scan.next().charAt(0);
		System.out.println("Soyisminizi girin");
		String soyİsim =scan.next();
		char sonHarf = soyİsim.charAt(soyİsim.length()-1);
		if(ilkHarf<=sonHarf){
			while (ilkHarf<=sonHarf){
				System.out.print(ilkHarf+" ");
				ilkHarf++;
			}
		}else{
			while (sonHarf<=ilkHarf){
			System.out.print(sonHarf+" ");
			sonHarf++;

		}

		}
		int i =0;
		int j =0;
		if (isim.length()>soyİsim.length())
		while (i<=isim.length()-1){
			System.out.print(isim.charAt(i)+" ");
			i++;
		}
		while (j<=soyİsim.length()-1){
			System.out.println(soyİsim.charAt(j)+" ");
			j++;
		}


	}

}
