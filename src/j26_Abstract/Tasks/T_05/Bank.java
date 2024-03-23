package j26_Abstract.abstract06;

public abstract class Bank {
    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;
    public Bank(String name, String phoneNumber, String address, int numEmployee) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setNumEmployee(numEmployee);
    }
    // hesaptan giden para
    String withdraw(double gidenPara) {
        this.balance -= gidenPara;
        return gidenPara + " Euro Çekildi...";
    }

    // hesaba gelen para
    String deposit(double gelenPara) {
        this.balance += gelenPara;
        return gelenPara + " Euro alindi...";
    }

    String loan() {
        return "kredi cekilebilir...";
    }
    public abstract void openAccount();

    public abstract void closeAccount();

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", numEmployee=" + numEmployee +
                ", balance=" + balance +
                '}';
    }
}
