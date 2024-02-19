package j14_Varargs;

public class Task02 {
    public static void main(String[] args) {
        /*
Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
 */

        toplaCarp(2,24,23,38,21,59,26,10);
    }

    private static int toplaCarp(int i, int... i1) {
        int toplam =0;
        for (int w:i1){
            toplam+=w;
        }
        return i*toplam;
    }
}
