package j19_Constructor;

public class C04_Teacher_Runner {

    public static void main(String[] args) {
        C04_Teacher t1 = new C04_Teacher("Dogukan","Sakar","QA",5,70000,false);
        System.out.println("t1 = " + t1);
        t1.emekli=true;
        t1.tecrube =7;
        System.out.println("t1 = " + t1);
        t1.tebrik();//obj ile nonstatic meth call edildi
        C04_Teacher.maasHesapla();//static meth obj ile değil meth ismi ile veya class ismi ile call edilir.
        C04_Teacher t2 = new C04_Teacher("Selim","Halid","Dev",5,55000,false);
        System.out.println("t2 = " + t2);
    }
}
