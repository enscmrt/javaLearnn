package j24_Inheritance.inheritance02;

public class Memeliler extends Hayvanlar{
    int m =1;
    int c=4;

    public Memeliler() {
        this('H');//bu classtaki p li const call edildi.
        System.out.println("Memeliler class taki p siz const call edildi");
    }

    public Memeliler(char y) {
        super(34);//parent class taki p li const call edildi
        System.out.println("Memeliler class 1 pli const call edildi");
    }

    public void mC(){
        System.out.println("mC -> Memeliler class meth call edildi");
    }

    @Override
    public void mM() {
        System.out.println("mM->Memeliler class meth call edildi");
    }
}
