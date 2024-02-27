package j14_Varargs.Tasks;

public class Task04 {
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
        String strArr1[] = {"h", "a", "l", "u", "k"};
        String strArr2[] = {"a", "l", "i"};
        int sayi = 3;
        yazdır(sayi,strArr1,strArr2);

    }

    private static void yazdır(int sayi, String[] ... metin ) {
        for (String[] each: metin) {
            for (int i = 0; i < sayi; i++) {
                System.out.print(each[i]);


            }
            System.out.println();

        }

    }
}
