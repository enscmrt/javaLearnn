package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {
        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlarda while loop kullanılır.
       */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        for (int i = 3; i <=20 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("While ile");
        int i = 3;//While loop un başlangıç değeri tanımlandı
        while (i<=20){//i 20 den küçük olduğu sürece devam edecek
            System.out.print(i+" ");
            i++; //While loopun şartı için değişim komutu tanımlandı.
        }

        // task02-> 7 kere javaCAN print eden code create ediniz

        int tekrar=7;
        while (tekrar>=1){
            System.out.print("javaCAN");
            tekrar--;
        }

        for (int j = 1; j <=7 ; j++) {
            System.out.print("javaCAN");

        }

        // task03->2 basamaklı tek sayıları print eden code create ediniz

        int sayi=11;
        while (sayi<=99){
            System.out.println(sayi+" ");
            sayi+=2;
        }

        // task04->girilen ifadeyi tersten  print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ifade giriniz");
        String ifade = scan.nextLine();
        int harfSayısı = ifade.length();
        while (harfSayısı>0){
            System.out.print(ifade.charAt(harfSayısı-1));
            harfSayısı--;
        }

        // task05->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
        System.out.println("Pozitif bir tamsayı giriniz:");
        int sayi1 = scan.nextInt();
        int toplam =0;
        int start = 1;
        if (sayi1>=0){
            while (start<=sayi1){
                toplam+=start;
                start++;
            }


        }else System.out.println("Pozitif bir sayı giriniz");

        System.out.println("toplam = " + toplam);

        // task06->girilen tamsayının faktöriyelini  print eden code create ediniz

        System.out.println("Lütfen bir sayı giriniz:");
        int sayi2 = scan.nextInt();
        int faktöriyelini = 1;
        while (sayi2!=0){
            faktöriyelini*=sayi2;
            sayi2--;
        }
        System.out.println("faktöriyelini = " + faktöriyelini);
    }
}
