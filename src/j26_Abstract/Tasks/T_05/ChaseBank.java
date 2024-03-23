package j26_Abstract.abstract06;

public class ChaseBank extends j26_Abstract.abstract06.Bank {

    public ChaseBank(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Adınız ve adres bilgilerininz alındı.");
        System.out.println(this.getClass().getSimpleName() + " daki Hesap açılışınız yapıldı.");

    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma için talebiniz alındı");
        System.out.println(this.getClass().getSimpleName() + " daki Hesabınız kapatıldı..");

    }
}