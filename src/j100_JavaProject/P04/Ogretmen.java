package j100_JavaProject.P04;

public class Ogretmen extends Kisi {//Kisi parent Class'a extend child pojo Class

     //fields
   private String sicilNo;// instance:obj variable
   private String bolum;

   //constructor...
    public Ogretmen() {//p'siz sefil cons.

    }
    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {//full p'li zengin const.
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    //getter-setter meth..

    public String getSicilNo() {
        return sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    //toString method..

    @Override
    public String toString() {
        return super.toString() +
                ", sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum  ;
    }
}


































