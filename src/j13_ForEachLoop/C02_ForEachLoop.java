package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz..with for-each

        String[]arr1={"Sema", "Safvet", "saim", "Saliha", "Yücel","Doğukan","Halit"};
        String[]arr2={"Sema", "Semra", "Javacan","Saliha","Doğukan","Javanur","Safvet"};
        List<String> ortakElemanlar=new ArrayList<>();
        for (String avuc1:arr1){
            for (String avuc2:arr2){
                if(avuc1.equals(avuc2)){
                    ortakElemanlar.add(avuc1);
                }
            }
        }
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
}
