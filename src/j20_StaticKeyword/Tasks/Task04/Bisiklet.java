package j20_StaticKeyword.Tasks.Task04;

public class Bisiklet {
    private  int hiz;
    private int vites=Math.max(1,5);

    public int hizDegistir(int yeniHiz){
        this.hiz = yeniHiz;
        return this.hiz;
    }

    public int vitesArtir(){
        this.vites += 1;
        return this.vites;
    }

    public int vitesAzalt(){
        this.vites -= 1;
        return this.vites;
    }

    public int durumGoster(){
        return this.hiz;
    }
    public  void islemYap(){
        System.out.println(this.hiz);
        System.out.println(this.vites);

    }

    public Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    @Override
    public String toString() {
        return
                "hiz=" + hiz +
                ", vites=" + vites;
    }
}
