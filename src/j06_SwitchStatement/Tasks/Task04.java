package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz");
        String ay = scanner.nextLine().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case  "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("Belirtilen Ay 31 çeker");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("Belirtilen ay 30 çeker");
                break;
                case "şubat":
                    System.out.println("Hangi yil giriniz");
                    int yil= scanner.nextInt();
                    if (yil%4==0){
                        if (yil%100!=0||yil%400==0){
                            System.out.println("Girilen ay 29 ceker");
                        }else {
                            System.out.println("Girilen ay 28 ceker");
                        }
                    }
                    break;
            default:
                System.out.println("Hatali giris");
        }


    }
}
