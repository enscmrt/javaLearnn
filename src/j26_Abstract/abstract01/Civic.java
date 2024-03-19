package j26_Abstract.abstract01;

public class Civic extends Lastik {//concrete child class
    /*
  extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
  java CTE verdi
  çözüm:
  a) Unımplemented (uyarlanmamış) method implement edilmeli
  b)parent Honda class'dan abstarct keyword kaldırılmalı
  c)concrete olan child Civic class abstract tanımlanmalı
*/


    //concrete child Class abs. meth tanımlanır mı? nayır nolamazzzz
    //public  abstract void absMeth();
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli
    @Override
    public void motor() {
        System.out.println("1.6 motor neyine yetmiyor");

    }

    @Override
    void koltuk() {
        System.out.println("Biraz ucuza kaçıp kumaş koltuk mu yaptırdın");

    }

    @Override
    void kapi() {
        System.out.println("Yavaş kağpat elinde kalmasın");

    }

    @Override
    public void lastikEbat() {
        System.out.println("18 lastik kafi");

    }

    //polymorphism-> obj cok biçimlilik farklı data type ve farklı const
   // Civic obj = new Civic();
    //Honda obj1 = new Civic();

    }

