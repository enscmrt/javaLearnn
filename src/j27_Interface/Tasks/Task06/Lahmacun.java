package j27_Interface.Tasks.Task06;

public class Lahmacun implements IFood {

    @Override
    public void taste() {
        System.out.println("mükemmel yerli pizza..");
    }

    @Override
    public double ucret() {
        return 50;
    }

    void bake() {
        System.out.println("özel kıyma kullanıldı..");
    }

    void topping() {
        System.out.println("uygun şekilde açıldı...");
    }

    void dough() {
        System.out.println(" mayalı hamur hazırlandı");
    }
}
