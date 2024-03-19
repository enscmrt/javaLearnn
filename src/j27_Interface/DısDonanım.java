package j27_Interface;

public interface DısDonanım {
    void kapi();//public abs meth
    void kaporta();//public abs meth
    //String renk;//CTE final static String variable initial edilmek zorundadır
    public final static String renk ="Kirmizi";//initial edilmiş variable
    String RENK ="Kirmizi";//public static final initial variable
    static void anten(){
        System.out.println("Cekemeyen anten taksın");
    }
    public default String sisLamp(){
        return "Sisli havada can kurtarır";

    }

    public static void main(String[] args) {//interfacede main tanımlanabilir fakat bad practice dir
        //DısDonanım obj = new DısDonanım();//interface constructor olmadığı için obj create edilemez
        anten();//static meth call

    }
}
