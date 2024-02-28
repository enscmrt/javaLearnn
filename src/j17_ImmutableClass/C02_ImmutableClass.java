package j17_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        /*
 Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
LocalDate, BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
       StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
*/
        String name ="Ahmet";
        System.out.println("Immutable class");
        System.out.println("meth call öncesi name : "+name);
        System.out.println("name.concat(\"Bey offer aldı hayırlı olsun\") = " + name.concat("Bey offer aldı hayırlı olsun"));
        System.out.println("meth call sonrası name : "+name);
        System.out.println("mutable class");
        List<String>isimList=new ArrayList<>();
        System.out.println("meth call öncesi isim list : "+isimList);
        isimList.add("Safvet");
        isimList.add("Semra");
        isimList.add("tuba");
        isimList.remove(0);
        System.out.println("meth call sonrası list : "+isimList);





    }//main sonu
}//class sonu
