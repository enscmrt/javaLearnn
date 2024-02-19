package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Cumle giriniz: ");
            String cumle = sc.nextLine();

            if (cumle.charAt(0) >= 'A' && cumle.charAt(0) <= 'Z' && cumle.charAt(cumle.length() - 1) == '.') {
                System.out.println(cumle + "Cumlesi gerekli sartlari sagliyor.");
                break;
            } else {
                System.out.println(cumle + " Cumlesi gerekli sartlari saglamiyor Tekrar deneyin");
            }

        }while (true);



    }
}
