package j30_Map.Tasks;

import java.util.*;

public class Task04 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Map<String,String>tm=new TreeMap<>();
        tm.put("cümle","neler yapıyorsun java çalışmak nasıl bir duygu");
        System.out.println("tm.size() = " + tm.size());
        Set yeni=tm.entrySet();
        System.out.println("yeni.toString().split(\"\").length = " + yeni.toString().split("").length);

    }
}

