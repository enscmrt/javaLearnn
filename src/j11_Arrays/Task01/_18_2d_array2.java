package j11_Arrays.Task01;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

        int Arr[][] = {{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam = 0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                toplam += Arr[i][j];
            }

        }
        System.out.println("toplam = " + toplam);

    }
}