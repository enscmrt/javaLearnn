import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int grsHakki = 3;
        while (true) {
            System.out.println("Pin kodunu giriniz");
            String kulPin = input.nextLine();
            if (kulPin.equals(pin)) {
                System.out.println("Giriş başarılı");
                break;
            }else{
                System.out.println("Yanlış pin kod girdiniz Tekrar deneyiniz");
                grsHakki--;
                System.out.println("Kalan giriş hakkınız: "+grsHakki);
            }
            if(grsHakki==0){
                System.out.println("Hakkınız bitti telefoncuya git");
                break;
            }
        }

    }
}
