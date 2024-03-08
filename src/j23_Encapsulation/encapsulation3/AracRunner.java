package j23_Encapsulation.encapsulation3;

public class AracRunner {
    public static void main(String[] args) {
        Arac a1 =new Arac();
        a1.setModel("Volvo S80");
        a1.setRenk("Kırmızı");
        a1.setMotor(2000);
        a1.setYil(1985);
        System.out.println("a1 = " + a1);
        Arac a2 =new Arac("Mercedes E250","Gümüş gri",200,1983);
        System.out.println("a2.getModel() = " + a2.getModel());
        System.out.println("a2.getRenk() = " + a2.getRenk());
        System.out.println("a2.getMotor() = " + a2.getMotor());
        System.out.println("a2.getYil() = " + a2.getYil());
        Arac a3 =new Arac("Honda Civic","inci",160,202);
        System.out.println("a3.getModel() = " + a3.getModel());
        System.out.println("a3.getRenk() = " + a3.getRenk());
        System.out.println("a3.getMotor() = " + a3.getMotor());
        System.out.println("a3.getYil() = " + a3.getYil());
    }
}
