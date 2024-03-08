package j22_AccessModifier.baskaPackage;

import j22_AccessModifier.C01_AccessModifier;

public class C03_AccessModifierRunner {

    private  String privateName="Safvet Bey";
    protected String protectedName="Halit Bey";
    String defaultName ="Sema Hanım";
    public  String publicName= "Saim bey";




    public static void main(String[] args) {
       // C01_AccessModifier obj1 = new C01_AccessModifier();//p siz const private olduğu için call edilemedi.
        C01_AccessModifier obj1 =new C01_AccessModifier(33,40);//p li const public olduğu için başka classtan call edilerek obj create edildi.

        System.out.println("obj1.publicYas = " + obj1.publicYas);//farklı package dan sadece public variableye call edilebildi.
        //obj1.protectedYas -> farklı packageden public olmayan parent-chil olmayan protected variable call edilemez:CTE
        //obj1.defaultYas-> farklı packageden public olmayan deafult variable call edilemez:CTE
        //obj1.privateYas-> farklı packageden public olmayan private variable call edilemez:CTE
        C03_AccessModifierRunner obj2 = new C03_AccessModifierRunner();
        System.out.println("obj2.privateName = " + obj2.privateName);//kendi classından obje olduğu için tüm memberlara obj ulaşabilidi.
        System.out.println("obj2.protectedName = " + obj2.protectedName);//kendi classından obje olduğu için tüm memberlara obj ulaşabilidi.
        System.out.println("obj2.defaultName = " + obj2.defaultName);//kendi classından obje olduğu için tüm memberlara obj ulaşabilidi.
        System.out.println("obj2.publicName = " + obj2.publicName);//kendi classından obje olduğu için tüm memberlara obj ulaşabilidi.

        //C01_AccessModifier.privateMeth();//static ama class name ile call edilemeyen meth.
        //C01_AccessModifier.defaultMeth();//farklı package old için static ama class name ile call edilemeyen meth.
    }


}
