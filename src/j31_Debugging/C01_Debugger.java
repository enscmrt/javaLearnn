package j31_Debugging;

public class C01_Debugger {
    static int falanFilan=7;
    public static void main(String[] args) {
        /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...


İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
        method01();

    }

    private static void method01() {
        System.out.println("**** Method01 çalışıyor ****");
        falanFilan++;
        int a =0;
        for (int i = 1; i <10 ; i++) {
            System.out.println(i+" ");
            a+=2*i;

        }
        System.out.println();
        System.out.println("**** Method02 call ediliyor ****");
        method02();
        System.out.println("**** Method02 call ediliyor ****");
        method03();
        System.out.println("method 01 bitti");
    }

    private static void method03() {
        System.out.println("method 03 çalışıyor");
        for (int y = 0; y <= 5; y++) {
            System.out.println(y+" ");


        }
        System.out.println();
        System.out.println("**** Method03 bitti ****");
    }

    private static void method02() {
        System.out.println("method 02 çalışıyor");
        falanFilan+=5;
        for (int x = 0; x <=7; x++) {
            System.out.println(x+" ");

        }
        System.out.println();
        System.out.println("**** Method02 bitti ****");
    }
}
