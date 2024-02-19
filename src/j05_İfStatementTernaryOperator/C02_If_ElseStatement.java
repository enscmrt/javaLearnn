package j05_İfStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {
    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..
        Scanner sc= new Scanner(System.in);
       System.out.println("Lütfen yaşınızı giriniz");
        int yas = sc.nextInt();
        if (yas > 18) {
            System.out.println("Git bana bir sigara al");
        } else {
            System.out.println("Buyude gel");
        }




    }
}
