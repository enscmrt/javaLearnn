package j05_İfStatementTernaryOperator;

import java.util.Scanner;

public class c06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tam sayı giriniz");
        int sayi = scanner.nextInt();
        if(sayi<0){
            System.out.println("Lütfen pozitif giriniz!!!");
        }else{
            System.out.println(sayi>999&&sayi<10000? sayi+" Sayısı 4 basamaklı":
                    (sayi%2==0?sayi+" 4 basamaklı olmayan çift sayı":sayi+" 4 basamaklı olmayan tek sayı"));
        }


    }
}
