package j99_codeChallenge.Challenge02;

public class Task01_Modulus {
    public static void main(String[] args) {
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
// Hint: use / and %
//    input: 12345
//    output: 1
//            2
//            3
//            4
//
        int a = 12345;
        int birler = a%10;
        int onlar = (a/10)%10;
        int yüzler = (a/100)%10;
        int binler = (a/1000)%10;
        int onbinler = a/10000;

        System.out.println("birler:"+birler+"\nonlar:"+onlar+"\nyüzler:"+yüzler+"\nbinler:"+binler+"\nonbinler:"+onbinler);
    }
}
