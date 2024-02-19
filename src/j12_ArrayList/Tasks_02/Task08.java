package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        List<Integer>sayiList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Listeyi atamak için elemanları giriniz \nyeterli sayıya ulaşınca 'q' giriniz");
        int islem =0;
        int toplam =0;
        while (islem>=0){
            System.out.println("Bir sayı giriniz");
            islem= scan.nextInt();
            if (islem>0){
                sayiList.add(islem);
                toplam+=islem;
            }

        }
        System.out.println("sayiList = " + sayiList);
        System.out.println("toplam = " + toplam);
        int ort =toplam/sayiList.size();
        System.out.println("ort = " + ort);
        for (int i = 0; i < sayiList.size(); i++) {
            if (sayiList.get(i)>ort){
                System.out.println("sayiList.get(i) = " + sayiList.get(i));
            }

        }


    }


}
