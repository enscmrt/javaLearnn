package j99_codeChallenge.Challenge08;

public class Task07 {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */


        int arrSayi[][]= {{7,2,3}, {2,3,1} , {5,5,5} , {2,-1,-33}};
        int minSayi = arrSayi[0][0];
        for (int i = 0; i < arrSayi.length ; i++) {
            for (int j = 0; j < arrSayi[i].length; j++) {
                if (arrSayi[i][j] < minSayi) {
                    minSayi = arrSayi[i][j];
                }

            }
        }
        System.out.println("minSayi = " + minSayi);

    }// main sonu




}// Class sonu