package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Yapacağınız işlemi giriniz");
        char islem =scan.next().charAt(0);
        dortIslem(islem,sayi1,sayi2);


    }//main sonu

    private static void dortIslem(char islem, int sayi1, int sayi2) {
        switch (islem){
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatalı işlem girdiniz!!!");
        }
    }

}//Class sonu
