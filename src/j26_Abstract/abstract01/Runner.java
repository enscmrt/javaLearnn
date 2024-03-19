package j26_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.motor();
        c1.kapi();
        c1.koltuk();
        c1.sunroof();
        c1.kisLastik();
        c1.lastikEbat();
        c1.name="Enes Bey";
        System.out.println("c1.name = " + c1.name);

        Accord c2 =new Accord();
        c2.motor();
        System.out.println("c2.name = " + c2.name);
        c2.kapi();
        c2.sunroof();
        c2.koltuk();

        Crv c3 =new Crv();
        c3.name="Seher hanım";
        c3.motor();
        c3.koltuk();
        c3.sunroof();
        c3.kapi();


    }
}
