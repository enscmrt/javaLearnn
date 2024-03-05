package j20_StaticKeyword;

public class C03_StaticKeyword {

    int ogtId;
    static int ogrSayisi;

    public C03_StaticKeyword() {//p siz const
        ogrSayisi++;// bu const call edildiğinde yani obj create edildiğinde ogr sayisi static variable her obj içinkalıcı olarak artırılır
        ogtId++;//bu const call edildiğinde yani obj create edildiğinde ogrId create edilen obj ye özel değer alır.
    }

    public static void main(String[] args) {
        System.out.println("a obj öncesi öğrenci sayısı : "+ogrSayisi);
        C03_StaticKeyword a= new C03_StaticKeyword();
        System.out.println("a obj öncesi öğrenci sayısı : "+ogrSayisi);
        C03_StaticKeyword b = new C03_StaticKeyword();
        C03_StaticKeyword c = new C03_StaticKeyword();
        C03_StaticKeyword d = new C03_StaticKeyword();
        System.out.println("a,b,c,d objleri sonrası öğrenci sayısı : "+ogrSayisi);

        C03_StaticKeyword e;
        System.out.println("e obj sonrası öğrenci sayısı : "+ogrSayisi);
        System.out.println("a ogrId : "+a.ogtId);
        System.out.println("a ogrId : "+b.ogtId);
        System.out.println("a ogrId : "+c.ogtId);
        System.out.println("a ogrId : "+d.ogtId);
       // System.out.println("a ogrId : "+e.ogtId);


    }
}
