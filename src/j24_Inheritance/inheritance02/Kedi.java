package j24_Inheritance.inheritance02;

public class Kedi extends Memeliler{
    int c =2;
    int d =7;

    public Kedi() {
        super();//parent Memeliler class taki p siz const call edildi
        System.out.println("Kediler class taki p siz const call edildi");
    }

    public Kedi(String str) {
        this();//bu classtaki default p siz const call edildi
        System.out.println("super.c = " + super.c);//kendi parent classtaki c variable call edildi
        System.out.println("Kediler class taki 1 p li const call edildi");
    }

    @Override//annotation->overriden (ezilen) meth ile override (ezen) meth ilişkilendiriliyor.
    public void mC() {
        System.out.println("mC-> kedi class meth call edildi");
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "c=" + c +
                ", d=" + d +super.toString();
    }
}
