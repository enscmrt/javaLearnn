package j24_Inheritance.Tasks.Task02;

public class SubClass extends SuperClass {
    int sayi=17;

    @Override
    public String ebikGabik() {
        return "Agam SubClass'dan selam dewamkeee. ";
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.javaCan();//obj ile non-static meth call edildi
        //javaCan meth non-static old icin maine dogrudan call edilemez
    }

    public void javaCan(){
        System.out.println("super.ebikGabik() = " + super.ebikGabik());
        System.out.println("this.ebikGabik() = " + this.ebikGabik());
        System.out.println("super.sayi = " + super.sayi);
        System.out.println("this.sayi = " + this.sayi);
    }
}//Class sonu
