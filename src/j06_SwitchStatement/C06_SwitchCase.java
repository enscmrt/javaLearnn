package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gün giriniz");
        String günler = scanner.nextLine().toLowerCase();
        switch (günler) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println(günler + " hafta içi");
                break;
                case "Cumartesi":
                case "Pazar":
                System.out.println(günler + " hafta sonu");

                default:
                    System.out.println("Hatalı giriş");
        }



    }
}
