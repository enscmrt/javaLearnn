package j26_Abstract.abstract03;

public class Dikdortgen extends j26_Abstract.abstract03.Sekil {
    double en;
    double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alan() {
        return en*boy;
    }

    @Override
    public double cevre() {
        return 2*(boy+en);
    }


}
