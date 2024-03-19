package j27_Interface;

public class Sahin extends Tofask implements DısDonanım,IcDonanım,Lastik{
    @Override
    public void motor() {
        System.out.println("1.6 motor az yakar çok kaçar");

    }

    @Override
    public void yakıt() {
        System.out.println("Tup yoksa eve ates duser");

    }

    @Override
    public void kapi() {
        System.out.println("4 kapi sedan");

    }

    @Override
    public void kaporta() {
        System.out.println("Akordion KAPORTA");

    }

    @Override
    public void koltuk() {
        System.out.println("Deri koltuk yaz aylarıunda terletir");

    }

    @Override
    public void klima() {
        System.out.println("Cam neyine yetmiyor");

    }

    @Override
    public void ebatLastik() {
        System.out.println("Lastik gibi sündürme");

    }

    @Override
    public void jant() {
        System.out.println("Jilet Ahmet Janti giyinir");

    }
}
