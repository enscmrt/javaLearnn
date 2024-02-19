package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = input.nextLine();
       onlyOne(metin);


    }//main sonu

    private static void onlyOne(String metin) {
        String yeniMetin ="";
        for (int i = 0; i < metin.length(); i++) {
            if(!yeniMetin.contains(metin.substring(i,i+1))){
                yeniMetin +=metin.charAt(i);
        }

    }System.out.print(yeniMetin);


}


}
