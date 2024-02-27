package j12_ArrayList.Tasks_02;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
 // Task-> Kullancıdan alınan str'nin karakter saysını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scan.next();
        int count=0;
        /*for (int i = 0; i < metin.length(); i++) {
            count++;
        }
        System.out.println("count = " + count);*/
        List<String>yeni=new ArrayList<>(Arrays.asList(metin.split("")));
        System.out.println("yeni = " + yeni);
        System.out.println("yeni.size() = " + yeni.size());


    }
}
