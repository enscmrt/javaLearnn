import java.util.Scanner;

public class Q60_SumWithoutLoop {
   /*
   Task-> girilen sayıya kadar olan pozitif tamsayıların toplamını loop kullanmadan print eden code create ediniz.
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayı girdiniz. Lütfen pozitif bir sayı giriniz.");
            return;
        }

        int toplam = sayi * (sayi + 1) / 2;
        System.out.println("Girilen sayıya kadar olan pozitif tamsayıların toplamı: " + toplam);




    }//main sonu


}
