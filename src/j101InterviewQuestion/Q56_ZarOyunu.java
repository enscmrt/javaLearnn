import java.util.Scanner;

public class Q56_ZarOyunu {
    /* Task->
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" ,
     aksi takdirde "Tekrar deneyiniz" print eden code create ediniz

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk zarı giriniz: ");
        int zar1 = scanner.nextInt();

        System.out.print("İkinci zarı giriniz: ");
        int zar2 = scanner.nextInt();

        if (zar1 + zar2 == 9) {
            System.out.println("Kazandınız");
        } else {
            System.out.println("Tekrar deneyiniz");
        }



    }
}
