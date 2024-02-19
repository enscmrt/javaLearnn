package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //task-> bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        String ondalık = input.next();
        int sayı;
        if(ondalık.contains(".")){
            sayı = Integer.parseInt(ondalık.substring(ondalık.indexOf(".")+1));
        }else{
            sayı=Integer.parseInt(ondalık);
        }
        int toplam =0;
        while (sayı!=0){
            toplam+=sayı%10;
            sayı/=10;

        }
        System.out.println("toplam = " + toplam);


    }
}
