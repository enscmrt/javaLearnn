package j27_Interface.Tasks.Task06;

public class Borsh implements IFood{

    @Override
    public void taste() {
        System.out.println("yeni tadlara merhaba");
    }

    @Override
    public double ucret() {
        return 29.90;
    }

    void boil() {
        System.out.println("kısık ateşde ağır ağır pişti");
    }
}
