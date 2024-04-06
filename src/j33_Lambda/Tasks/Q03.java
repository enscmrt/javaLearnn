package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q03 {
    //String isimlerden olusan bir list olusturun
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
//Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
//Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
//Konsoldaki farklı öğeleri ters sırada yazdırın.
//Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lutfullah");
        list.add("Emine");
        list.add("Emine");
        list.add("Yusuf");
        list.add("Seyfullah");
        list.add("Hakan");
         list.stream().distinct().map((t)->t.length()).forEach(SeedMethods::intYazdir);
        System.out.println();
         list.stream().distinct().map((t)->t.length()).sorted().forEach(SeedMethods::intYazdir);
        System.out.println();
        list.stream().distinct().sorted(Comparator.comparing((t)->t.toString().charAt(t.toString().length()-1))).forEach(SeedMethods::strYazdir);
        System.out.println();
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(SeedMethods::strYazdir);
        System.out.println();
        list.stream().filter((t)->t.length()<7).distinct().sorted(Comparator.reverseOrder()).map(String::toUpperCase).forEach(SeedMethods::strYazdir);


    }
}