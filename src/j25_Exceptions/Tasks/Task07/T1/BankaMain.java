package j25_Exceptions.Tasks.Task07._02;

public class BankaMain {
    public static void main(String[] args) {
        new j25_Exceptions.Tasks.Task07._02.MusteriEkle();
        new j25_Exceptions.Tasks.Task07._02.Islemler();
        j25_Exceptions.Tasks.Task07._02.Account obj = new j25_Exceptions.Tasks.Task07._02.Account();
        obj.setAccountNumber(1234567890);
        obj.paraEkle(500);
        System.out.println("obj.getBakiye() = " + obj.getBakiye());


    }
}
