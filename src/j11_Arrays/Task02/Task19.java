package j11_Arrays.Task02;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};


        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};


        /*for (int i = 0; i < arr1.length&& i<arr2.length; i++) {
            int toplam=0;
            for (int j = 0; j < arr1[i].length && j<arr2[i].length; j++) {
                toplam+=arr1[i][j]+arr2[i][j];

            }System.out.println("toplam = " + toplam);

        }*/

       /* for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            int sum = 0;
            for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {
                sum += arr1[i][j] + arr2[i][j];
            }
            System.out.println("Indeks " + i + " toplami: " + sum);
        }*/
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) { // 1. Arrayi geziyor

            for (int k = 0; k < arr2.length; k++) { // 2. Arrayi geziyor

                if (i == k) // 1. Array ile 2. Arrayin dis array indexleri esit ise calisiyor

                    for (int j = 0; j < arr1[i].length; j++) { // 1. Arrayin ic arraylerini geziyor

                        for (int l = 0; l < arr2[k].length; l++) { // 2. Arrayin ic arraylerini geziyor

                            if (j == l) { // ic arraylerin indexleri esit ise calisan if blogu

                                sum = sum + arr1[i][j] + arr2[k][l];  // ayni index'e sahip elemanlari topluyor
                            }
                        }
                    }
            }
        }
        System.out.println(sum);



    }
}
