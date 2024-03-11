package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {

        Kedi k1=new Kedi();//kedi class type obj create edildi
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        Memeliler k2=new Kedi("beyaz");
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.c = " + k2.c);
       // System.out.println("k2.d = " + k2.d);//CTE datatype memeliler classda d variable tanımlı olmadığı için
        System.out.println("k2.m = " + k2.m);

        Hayvanlar k3=new Kedi("poncik");
        System.out.println("k3.a = " + k3.a);
        System.out.println("k3.m = " + k3.m);

        /*
Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
*/

    }
}
