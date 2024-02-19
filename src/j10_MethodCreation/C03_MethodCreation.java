package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {//class level
    public static void main(String[] args) {//main level

        String hlt ="en hakiki javacı";
        String sema ="javaNAZZ";
        selamVer();//tanımlandığı classta scopta method name ile direkt call edilebilir.
        System.out.println("hlt = " + hlt);
        System.out.println("sema = " + sema);
        /*
        Farklı classlardan meth call etmek için clasName.methodName ile yada class import edilerek call işlemi yapılır
        static method olarak call edilir gökteki güneş gibidir.
        Aynı classta method dogrudan name ile call edilir.
         */
        C03_MethodDepo.gecmeNotu(88);//Class name ile meth call edildi
        gecmeNotu(43);//import edildi

    }//main sonu

    private static void selamVer() {
        System.out.println("beni köyümün yağmurlarında yıkasınlar");
        gecmeNotu(55);//main dışına farklı method içine call edildi.
    }

    //gecmeNotu(65);Method dışına method call işlemi olmaz.


}//class sonu
