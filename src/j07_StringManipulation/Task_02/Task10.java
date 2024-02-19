package j07_StringManipulation.Task_02;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim = scan.nextLine();
        if(isim.length()==3){
            System.out.println(isim.charAt(0)!=isim.charAt(1)&&isim.charAt(0)!=isim.charAt(2)&&isim.charAt(1)!=isim.charAt(2)
            ?"Girilen ismin tüm karakterleri farklıdır":"Girilen ismin en az 2 karakteri aynıdır.");

        }else
            System.out.println("Girilen ismin 3 karakter olmalıdır");

    }
}