package j26_Abstract.abstract03;

public class Runner {
    public static void main(String[] args) {
        j26_Abstract.abstract03.Cember c1=new j26_Abstract.abstract03.Cember();
        c1.name="Cember";
        c1.yarıçap=5;
        System.out.println("c1.getName() = " + c1.getName());
        c1.ciz();
        System.out.println("c1.alan() = " + c1.alan());
        System.out.println("c1.cevre() = " + c1.cevre());
        System.out.println("c1.toString() = " + c1);


        System.out.println("   ***   ");
        j26_Abstract.abstract03.Dikdortgen d1=new j26_Abstract.abstract03.Dikdortgen(12,35);
        d1.name="Dikdortgen";
        d1.ciz();
        System.out.println("d1.alan() = " + d1.alan());
        System.out.println("d1.cevre() = " + d1.cevre());
        System.out.println("d1 = " + d1);




    }
}
