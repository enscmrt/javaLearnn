package j24_Inheritance.inheritance02;

public class Hayvanlar {//grandparent class
    int a;
    int m=3;

    public Hayvanlar() {
        System.out.println("Hayvanlar class p siz const call edildi.");
    }

    public Hayvanlar(int x) {
        System.out.println("Hayvanlar class p li const call edildi.");
    }

    public void mA(){
        System.out.println("mA -> Hayvanlar classındaki meth call edildi.");
    }

    public void mM(){
        System.out.println("mA -> Hayvanlar classındaki meth call edildi.");
    }


}
