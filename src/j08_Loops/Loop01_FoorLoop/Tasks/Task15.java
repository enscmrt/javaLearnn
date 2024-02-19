package j08_Loops.Loop01_FoorLoop.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz: ");
		String str = scan.nextLine();
		int count =0;
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                count++;
            }

        }
		if(count>0){
			System.out.println(str+"içinde"+" "+count+"adet rakam vardır");
		}else {
			System.out.println(str+" "+ "içinde rakam yoktur");
		}

		int temp = str.replaceAll("\\D","").length();
		System.out.println(temp);

	}
}
