package j11_Arrays;

public class C08_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        };
//        array elamanları toplamını print eden code create ediniz.

        int arr[][] = {
                {3, 5},
                {12, 13, 15},
                {103, 107, 111, 121}
        };
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];

            }

        }
        System.out.println("toplam = " + toplam);
    }
}
