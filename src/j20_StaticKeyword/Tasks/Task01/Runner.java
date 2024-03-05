package j20_StaticKeyword.Tasks.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
    */


    public static void main(String[] args) {
        Rectangle c = new Rectangle(10,15);
        c.cevreHesapla();
        c.alanHesapla();
        System.out.println("Alan ve cevre hesabı = " + c);



    }
}
