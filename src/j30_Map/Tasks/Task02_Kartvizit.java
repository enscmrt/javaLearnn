package j30_Map.Tasks;

public class Task02_Kartvizit {//pojo class-> kartvizit obj field ve meth bulunduracak
    //fields
    String  isim;
    String  email;
    String  adres;
    String telefon;
    static int id=100;

    public Task02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Task02_Kartvizit{" +
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
