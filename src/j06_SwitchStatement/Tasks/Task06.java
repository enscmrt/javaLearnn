package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Harf Giriniz");
        char ch = scanner.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'v':
                System.out.println("Very"); break;
            case 'i':
                System.out.println("Important"); break;
            case 'p':
                System.out.println("Person"); break;
            default: System.out.println("Lütfen geçerli harf giriniz!!!");

            break;
        }


    }
}
