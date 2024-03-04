package j19_Constructor;

public class C05_Arac {//Fieldsm-obj-instance variables
    String model;
    int maxHiz;

    public C05_Arac() {
        System.out.println("Bu yazıyı okuyorsanız p siz const run oldu");
    }

    public C05_Arac(String model) {//1 pli const
        this("Haci Murat",123);//full pli const call edildi
        // this();//p'siz const 2. satırda olg için call edilemedi->CTE
    /*
     1) Constructor icinden baska bir Constructor call  icin "this()" kullanılır.
        this() keyword mutlaka constructor body'nin ilk satirına yazılmalı
        Aksi takdirde CTE verir
    2) Bir Constructor icinden sadece bir tane Constructor call  yapılır.Cunku birden cok const. call edilirse
        birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
    */
        this.model = model;

        System.out.println("Bu yazıyı okuyorsanız 1 pli const run oldu");
    }

    public C05_Arac(String model, int maxHiz) {//fıll parametreli const
        this();//p siz const call edildi const call mutlaka ilk satırda olmalıdır.
        this.model = model;
        this.maxHiz = maxHiz;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz;
    }
}
