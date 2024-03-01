package j19_Constructor;

public class C02_Arac {//class level
    //fields->instance variables
    String marka;
    String model;
    int km;
    int motorHacim;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;

    public C02_Arac(String marka, String model, int km, int motorHacim, boolean vitesAuto, boolean ikinciEl, int yil) {
        this.marka = marka;
        this.model = model;
        this.km = km;
        this.motorHacim = motorHacim;
        this.vitesAuto = vitesAuto;
        this.ikinciEl = ikinciEl;
        this.yil = yil;
    }

    public C02_Arac() {

    }

    @Override
    public String toString() {
        return
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil;

    }

    public static void main(String[] args) {//main level
        /*
Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciEl,yıl olan
 3 obj  create ederek fields print eden code create ediniz.
 */

        C02_Arac arac1=new C02_Arac();//parametresiz default const call edilerek arac1 objesi create edildi
        arac1.marka="Volvo";
        arac1.model="xc90";
        arac1.ikinciEl=false;
        arac1.yil=2015;
        arac1.motorHacim=2000;
        arac1.km=130000;
        arac1.vitesAuto=true;
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.vitesAuto + " " + arac1.yil + " " + arac1.ikinciEl + " " + arac1.km + " " + arac1.motorHacim);
        C02_Arac arac2 = new C02_Arac("BMW","X6",333000,4000,true,true,2012);
        System.out.println(arac2.marka + " " + arac2.model + " " + arac2.vitesAuto + " " + arac2.yil + " " + arac2.ikinciEl + " " + arac2.km + " " + arac2.motorHacim);
        System.out.println("arac1 = " + arac1);
        System.out.println("arac1.toString() = " + arac1.toString());
    }//main sonu


}//class sonu
