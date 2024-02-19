package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner scan = new Scanner(System.in);
        System.out.println("Sınav notunu giriniz");
        double sınav = scan.nextDouble();
        System.out.println("Ara sınav notunu giriniz");
        double ara_sınav = scan.nextDouble();
        System.out.println("Final notunu giriniz");
        double final_puan = scan.nextDouble();
        double ortNot = sınav*0.3+ara_sınav*0.4+final_puan*0.3;
        if(ortNot>=90){
            System.out.println("Notunuz = A");
        } else if (ortNot>=70 && ortNot<90) {
            System.out.println("Notunuz = B");}
        else if (ortNot>=50 && ortNot<70) {
            System.out.println("Notunuz = C");}
        else if (ortNot<50) {
            System.out.println("Notunuz = F");
        }
        else {
            System.out.println("Hatalı bir not girdiniz");

        }


    }
}
