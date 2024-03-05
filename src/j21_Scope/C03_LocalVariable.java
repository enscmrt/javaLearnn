package j21_Scope;

public class C03_LocalVariable {
    public static void main(String[] args) {
        int yas =35;//main localde create edillen primitive variable
        System.out.println("yas = " + yas);//aynı scope a doğrudan call edilebilir.

        for (int i = 0; i <= 9; i++) {
            System.out.println(yas + " "+i);
            i+=3;


        }
        //i+=7;//scope dıdışında çağrılamaz
        yas=49;//main scope variable call edilerek atama yapıldı.
    }
   // yas =50;//main scope variable scope dışıns call edşlemez.
}
