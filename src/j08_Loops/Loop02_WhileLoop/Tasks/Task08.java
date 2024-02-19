package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreTekrar= true;
        while (sifreTekrar){
            System.out.print("Sifre giriniz: ");
            sifre = scan.nextLine();
            if(sifreKontrol(sifre)){
                System.out.println("sifre basarıyla kaydedildi");
                sifreTekrar = false;
            }

        }

    }

    private static boolean sifreKontrol(String sifre) {
        int flag =0;
        //İlk karakter küçük olmalı kontrolü
        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("İlk harf küçük olmalı!!!");
            flag++;
        }
        //Son karakter rakam olmalı kontrolü
        //if((sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')
        if(!(Character.isDigit(sifre.charAt(sifre.length()-1)))){
            System.out.println("Son karakter rakam olmalı!!!");
            flag++;
        }
        if(sifre.contains((" "))){
            System.out.println("Sifrede boşluk olmamalı");
            flag++;
        }
        if(!(sifre.length()>=10)){
            System.out.println("Sifre uzunlugu en az 10 karakter olmalı!!!");
            flag++;
        }
        return  flag==0;

    }
}
