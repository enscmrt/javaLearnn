package j25_Exceptions.Tasks.Task04;

import java.util.Scanner;

import static j25_Exceptions.Tasks.Task04.Okul.okulList;


public class OkulMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Okul obj = new Okul();
        obj.setMaxOgrSayisi(10);

        for (int i = 1; i <= okulList.size(); i++) {
            int count=0;
            count++;
            okulList.add(okulList.get(15));
            try {
                if(okulList.size()>obj.getMaxOgrSayisi()){
                    throw new ArithmeticException("Öğrenci sayısı sınırı aşıldı");
                }else System.out.println("Öğrenci limiti var");

            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }







    }
}
