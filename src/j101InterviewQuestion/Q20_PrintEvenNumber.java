import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Lütfen sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi%2==0){
            System.out.println(sayi+" çift sayı");
        }else {
            System.out.println(sayi+" tek sayı");
        }

        System.out.println("tekCiftKontrol1(sayi) = " + tekCiftKontrol1(sayi));
        System.out.println("tekCiftKontrol2(sayi) = " + tekCiftKontrol2(sayi));
        tekCiftKontrol3();



    }//main sonu

    private static void tekCiftKontrol3() {
        System.out.println("Lütfen sayı giriniz");
        int sayi = scan.nextInt();
        if (sayi%2==0){
            System.out.println(sayi+" çift sayı");
        }else {
            System.out.println(sayi+" tek sayı");
        }


    }

    private static String tekCiftKontrol2(int sayi) {
        return sayi%2==0?"ÇIFT":"TEK";
    }

    private static boolean tekCiftKontrol1(int sayi) {
        return sayi%2==0?true:false;
    }

}//Class sonu
