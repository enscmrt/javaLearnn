package j07_StringManipulation.Task_02;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str=scan.nextLine();
        System.out.println("Hangi indexteki karakteri yazdırmak istersiniz ");
        int index = scan.nextInt();
        if(str.length()>index){
            System.out.println(str.charAt(index));
        }else{
            System.out.println("Bu indexteki karakter bulunamadı");
        }






    }
}
