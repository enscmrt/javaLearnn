package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {

    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        String pin ="JavvaNur";
        int grsHakki=3;
        while (true){
            System.out.println("Pin kodunu giriniz");
            String kulPin =scan.next();
            if (kulPin.equals(pin)){
                System.out.println("Giriş başarılı");
                System.out.println("Pin geçerli hoşgeldiniz");
                break;
            }else {
                System.out.println("Yanlış pin kod girdiniz Tekrar deneyiniz");
                grsHakki--;
                System.out.println(grsHakki+"tane deneme hakkın kaldı");
                if (grsHakki==0){
                    System.out.println("Hakkınız bitti telefoncuya git");
                    break;
                }
            }

        }
    }
}
