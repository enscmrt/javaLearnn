package j22_AccessModifier;

public class C02_AccessModifierRunner {
    public static void main(String[] args) {

        C01_AccessModifier obj = new C01_AccessModifier(42,49);//parametreli public const call edilerek obj create edildi.
        //C01_AccessModifier obj1 = new C01_AccessModifier();//p siz const private olduğu için başka class tan call edilemedi.
        System.out.println("obj.publicYas = " + obj.publicYas);
        System.out.println("obj.protectedYas = " + obj.protectedYas);
        System.out.println("obj.defaultYas = " + obj.defaultYas);
        //System.out.println("obj.privateYas = " + obj.privateYas);
        C01_AccessModifier.defaultMethod();
       // C01_AccessModifier.privateMeth();//private metoda başka classdan erişim olmaz->CTE
    }
}
