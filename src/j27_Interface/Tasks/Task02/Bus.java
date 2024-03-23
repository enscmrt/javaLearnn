package j27_Interface.Tasks.Task02;

public class Bus extends Vehicle implements IDiesel, IVehicle{


    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Euro diesel kullanın...";
    }

    @Override
    public String drive() {
       return  "azami 80 km hızı geçmeyin...";
    }
}
