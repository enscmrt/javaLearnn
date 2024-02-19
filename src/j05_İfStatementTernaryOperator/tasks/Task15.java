package j05_İfStatementTernaryOperator.tasks;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ehliyetiniz var ise 1'i yoksa 0'ı seç?");
        int ehliyetVarMi = scan.nextInt();
        if(ehliyetVarMi==1){
            System.out.println("Kaç yıldır ehliyetin var?");
            int tecrübe = scan.nextInt();
            if(tecrübe>=7){
                System.out.println("Kaç km araba kullandın");
                int km = scan.nextInt();
                if(km>=100000){
                    System.out.println("Tebrikler kontak köpeğin olsun");
                }else {
                    System.out.println("Kontak anahtarı alabilmen için"+(100000-km)+"km araba kullanmalısın");
                }

            }else {
                System.out.println("Kontak anahtarı alabilmen için "+(7-tecrübe)+"yıl daha geçmesi lazım");
            }
        } else if (ehliyetVarMi==0) {
            System.out.println("Kontak anahtarı vermem için önce ehliyet al");
        }else System.out.println("İstediğim değer harici girme kardeşim");


    }
}





















