package j30_Map.Tasks;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static j100_javaProjects.P03_javaBankATM.JavaBankATM02.A03_Transactions.scan;
import static j100_javaProjects.P03_javaBankATM.JavaBankATM03.MethodlarClass.cikis;


public class Task03 {
    /*Task->
        1-Ekleme
        2-Listeleme
        3-Arama
        4-Düzeltme
        5-Çıkış
        Seçeneklerini vererek username(key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        Mainde  Seçenekler ve metodların call edip run ediniz.

         */
   static Map<String,String>yeni=new HashMap<>();

    public static void main(String[] args) {

        yeni.put("username", "ENES");
        yeni.put("password", "KLDG4587");
        yeni.put("userType", "Müdür");
        System.out.println( "         KULLANICI PANEL YÖNETİM SİSTEMİNE HOŞ GELDİNİZ\n========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1 EKLEME             |                2-LİSTELEME  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-ARAMA    |              |            4-DÜZELTME |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "                 ____________________   \n"
                + "                |  5-CIKIS      |   \n"
                + "                ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  ");

        System.out.print("Yapmak istediginiz islem : ");
        int secim =scan.nextInt();
        switch (secim) {
            case 1:
                ekleme();
                System.out.println("\nEKLEME İşlemi Yapıldı.");
                break;
            case 2:
                listeleme();
                System.out.println("\nLİSTELEME İşlemi Yapıldı.");
                break;
            case 3:
                arama();
                System.out.println("\nARAMA İşlemi Yapıldı.");
                break;
            case 4:
                duzeltme();
                System.out.println("\nDÜZELTME İşlemi Yapıldı.");
                break;
            case 5:
                cikis();
                System.out.println("\nÇIKIS İşlemi Yapıldı.");
                break;
            default:
                System.out.println("\nHatalı Giriş. Yeniden Deneyiniz.");
                break;
        }




    }

    private static void duzeltme() {
        System.out.println("düzeltmek istediğiniz birimi giriniz");
        String birimi=scan.next();
        if(yeni.containsValue(birimi)){
            System.out.println("yeni değeri giriniz");
            yeni.put(birimi,"enes");
        }

    }

    private static void arama() {
    }

    private static void listeleme() {
    }

    private static void ekleme() {
        System.out.println("usename giriniz");
        String usename=scan.next();
        yeni.put(usename,"ahmet");
        System.out.println("password gi");
        String password=scan.next();
        yeni.put(password,"<PASSWORD>");
        System.out.println("userType giriniz");
        String userType=scan.next();
        yeni.put(userType,"Müdür");


    }


}
