package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir ay giriniz");
        int ayNo = scanner.nextInt();
        switch ( ayNo ) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Girilen ay 31 çekmektedir");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 çekmektedir");
                break;
            case 2:
                System.out.println("Hangi yil giriniz");
                int yil= scanner.nextInt();
                if (yil%4==0){
                    if (yil%100!=0||yil%400==0){
                        System.out.println("Girilen ay 29 ceker");
                    }else {
                        System.out.println("Girilen ay 28 ceker");
                    }
                }else {
                    System.out.println("Girilen ay 28 ceker");
                }
                break;
            default:
                System.out.println("Hatali giris");
        }
        System.out.println("Kod calisiyor");

    }
}
