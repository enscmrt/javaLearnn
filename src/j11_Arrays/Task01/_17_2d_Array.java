package j11_Arrays.Task01;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String strArr[][] = {{"2", "3", "2"}, {"4", "1", "5"}, {"7", "2", "5"}};
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = strArr[i][j].replace("2", "6");
            }
        }
        System.out.println("Arrays.toString(strArr) = " + Arrays.deepToString(strArr));


    }
}