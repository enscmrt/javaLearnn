package j27_Interface.Tasks.Task02;

public interface IElectric{
    final static int batteryLife = 100;

    String changeBattery();


    default void ebikGabık() {
        System.out.println("default tipi metod yazılabilir...");
    }

    static void autoPilot() {
        System.out.println("otonom sürüş modu...");
    }

}
