package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder create etme
        //1.yol
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("Tuba hanımın");//sb1 e value eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("bilgisayarı coştu");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());//16*2+2
        sb1.append("inşallah kendine gelir");
        System.out.println("sb1.capacity() = " + sb1.capacity());

        //2.yol
        StringBuilder sb2 =new StringBuilder("Konya'da bamya yemegi");//initialize(ilk değer) atanmış sb oluştu.
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());//16+sb2.length()
        //trimtosize()-< kapasitedeki length fazlası değerleri siler.
        sb2.trimToSize();
        System.out.println("sb2.capacity() trim sonrası = " + sb2.capacity());

        //3.yol
        StringBuilder sb3 =new StringBuilder(17);
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());//16+sb3.length()
        sb3.append("155'i ararun cincix code");
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //sb'de istenen index karakteri alma
        System.out.println("sb3.charAt(17) = " + sb3.charAt(17));
        //System.out.println("sb3.charAt(99) = " + sb3.charAt(99));

        //sb deki belli aralıktaki karakterleri alma
        System.out.println("sb3.substring(11) = " + sb3.substring(11));
        System.out.println("sb3.subSequence(12,21) = " + sb3.subSequence(12, 21));
        System.out.println("sb3.substring(12,21) = " + sb3.substring(12, 21));

        //sb deki bir karakteri silme
        System.out.println("sb3.deleteCharAt(23) = " + sb3.deleteCharAt(23));
        System.out.println("sb3 = " + sb3);

        //sb de istenen aralıkta index karakterleri silme
        System.out.println("sb3.delete(12,21) = " + sb3.delete(12, 21));

        //sb de istenen charları girdi yapma insert
        System.out.println("sb3.insert(3,sb2,7,11) = " + sb3.insert(3, sb2, 7, 11));

        //sb deki istenen index charı update etme
        sb3.setCharAt(2,'$');
        System.out.println("sb3 = " + sb3);

        //sb deki index birden fazla char set etme
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "*"));
        //sb objesini string variableye çevirme
        StringBuilder sb4 =new StringBuilder("Safvet bey geçmiş olsun");
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());

        //str objesini sb variableye çevirme
        String str ="Hayırlı geceler";
        System.out.println("str = " + str);
        StringBuilder sb5 =new StringBuilder(str);//str sb ye atandı


    }
}
