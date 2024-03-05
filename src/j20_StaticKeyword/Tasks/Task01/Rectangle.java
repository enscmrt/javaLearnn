package j20_StaticKeyword.Tasks.Task01;

public class Rectangle {

    int width;
    int height;
    int cevreToplam;
    int alanToplam;



    public Rectangle(int width, int height, int cevreToplam, int alanToplam) {
        this.width = width;
        this.height = height;
        this.cevreToplam = cevreToplam;
        this.alanToplam = alanToplam;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void cevreHesapla(){
        cevreToplam=2*(width+height);


    }
    public void alanHesapla(){
        alanToplam=width*height;

    }

    @Override
    public String toString() {
        return
                "width=" + width +
                ", height=" + height +
                ", cevreToplam=" + cevreToplam +
                ", alanToplam=" + alanToplam ;
    }
}
