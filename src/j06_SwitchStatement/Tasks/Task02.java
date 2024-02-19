package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pazartesi->1\nSalı->2\nÇarşamba->3\nPerşembe->4\nCuma->5\nCumartesi->6\nPazar->7 \nHaftanın Kaçıncı günü olduğunu seçin");
        int gun = scanner.nextInt();
        if (gun > 0 && gun < 8) {
            int sonrası = (gun + 100) % 7;
            switch (sonrası) {
                case 1:
                    System.out.println("100 gün sonra:Pazartesi");
                    break;
                case 2:
                    System.out.println("100 gün sonra: Salı");
                    break;
                case 3:
                    System.out.println("100 gün sonra:arşamba");
                    break;
                case 4:
                    System.out.println("100 gün sonra: Perşembe");
                    break;
                case 5:
                    System.out.println("100 gün sonra: Cuma");
                    break;
                case 6:
                    System.out.println("100 gün sonra: Cumartesi");
                    break;
                case 7:
                    System.out.println("100 gün sonra: Pazar");
                    break;
            }

        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz");
        }
    }
}