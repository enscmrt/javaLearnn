package j26_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {
        System.out.println("2.0 motor cok kacar");


    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk pek lüks olmuş");

    }

    @Override
    void kapi() {
        System.out.println("4 kapılı araba güzel duruyor");

    }

    @Override
    void sunroof() {
        System.out.println("sigara yakmak için sunroof taktırdım");
    }
}
