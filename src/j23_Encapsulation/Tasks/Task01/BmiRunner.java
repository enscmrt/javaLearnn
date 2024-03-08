package j23_Encapsulation.Tasks.Task01;

public class BmiRunner {
    public static void main(String[] args) {

        Bmi obj1=new Bmi("Enes",35,1.75,68);
        System.out.println("obj1.getBmi() = " + obj1.getBmi());
        System.out.println("obj1.getStatus() = " + obj1.getStatus());


    }
}
