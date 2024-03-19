package j27_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin doganGorunumlu=new Sahin();
        doganGorunumlu.kapi();
        doganGorunumlu.motor();
        doganGorunumlu.kaporta();
        doganGorunumlu.klima();
        doganGorunumlu.jant();
        doganGorunumlu.ebatLastik();
        doganGorunumlu.sunroof();//non static concrete meth obj ile call edildi
        System.out.println("doganGorunumlu.sisLamp() = " + doganGorunumlu.sisLamp());//non static concrete meth obj ile call edildi
        DısDonanım.anten();//static concrete meth interface ile call edildi
        System.out.println("DısDonanım.RENK = " + DısDonanım.RENK);
        System.out.println("IcDonanım.RENK = " + IcDonanım.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        System.out.println("IcDonanım.KUMAS = " + IcDonanım.KUMAS);
        System.out.println("IcDonanım.MUSIC = " + IcDonanım.MUSIC);

    }
}
