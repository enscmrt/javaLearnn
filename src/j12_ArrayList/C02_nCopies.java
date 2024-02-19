package j12_ArrayList;

import java.util.*;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Alamanya", "İsveç", "Danimarka", "Belçika", "Hollanda, Finlandiya"));
        List<String>isimList = new ArrayList<>(Arrays.asList("Saim", "Safvet", "Halit", "Semra", "Seher", "Enes"));

        List<String>yeniList= new ArrayList<>(Collections.nCopies(7,"JavaCan"));
        System.out.println("yeniList = " + yeniList);

        //addAll(list)-> parametre olarak girilen listi istenen liste ekler.
        System.out.println("ulkeList = " + ulkeList);
        System.out.println("ulkeList = " + isimList);
        ulkeList.addAll(isimList);
        System.out.println("ulkeListe isimList eklenmiş hali = " + ulkeList);
        isimList.addAll(3,yeniList);
        System.out.println("isimList = " + isimList);
    }
}
