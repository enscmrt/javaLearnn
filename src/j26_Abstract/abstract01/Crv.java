package j26_Abstract.abstract01;

public class Crv extends Honda{//concrete child class
    @Override
    public void motor() {
        System.out.println("2.4 motor çok yakmazmı");

    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk yaz aylarıunda terletir");

    }

    @Override
    void kapi() {
        System.out.println("Himmet abi bana 3 kapılı araba alacan mı");

    }

    @Override
    void sunroof() {
        System.out.println("sunroof olmadan lüx olmaz");
    }
}
