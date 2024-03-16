package j25_Exceptions.Tasks.Task02;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
           /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.

    Trick->
    sicaklikKontrol(int sıcaklık){
     throw new IOException("AGAM hava buz gibi dışarı çıkma");
            */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz");
        int sıcaklık = input.nextInt();
        sicaklikKontrol(sıcaklık);




    }//main sonu

    private static void sicaklikKontrol(int sıcaklık) {
        try {
            if (sıcaklık < 10) {
                throw new IOException("AGAM hava buz gibi dışarı çıkma");
            }else System.out.println("Hava cok iyi evde durma");
        } catch (IOException e) {
            System.out.println("Hava durumu : "+ e.getMessage());
        }
    }
}//Class sonu
