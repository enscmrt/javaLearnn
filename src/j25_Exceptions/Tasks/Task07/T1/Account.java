package j25_Exceptions.Tasks.Task07._02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String adSoyad;
    private long bakiye;
    private long gunlukLimit;
    public static List<Account> accountList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public Account(long accountNumber, String adSoyad, long bakiye, long gunlukLimit) {
        this.accountNumber = accountNumber;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.gunlukLimit = gunlukLimit;
    }

    public Account() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public long getBakiye() {
        return bakiye;
    }

    public void setBakiye(long bakiye) {
        this.bakiye = bakiye;
    }

    public long getGunlukLimit() {
        return gunlukLimit;
    }

    public void setGunlukLimit(long gunlukLimit) {
        this.gunlukLimit = gunlukLimit;
    }
    public  static boolean TcKontrol(){
        String Tc="";
        if (Tc.length() ==10){
            return true;
        }else {
            System.out.println("TC geçersiz");
        }

     return false;
    }
    static List<Integer>account=new ArrayList<>();
    static int para = scan.nextInt();
    public static void paraEkle(){

        System.out.println("Lütfen yatırmak istediğiniz parayı giriniz");

        account.add(para);


    }
    public static void paracikar(){
        System.out.println("Lütfen çekmek istediğiniz parayı giriniz");
        int para = scan.nextInt();

    }
}
