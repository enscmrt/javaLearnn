package j99_codeChallenge.Challenge08;

public class Task04 {
    public static void main(String[] args) {
        /*task->
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * print eden   method create ediniz.
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        toplamDokuz(arr);



    }// main sonu

    private static void toplamDokuz(int[] arr) {
        int istenenToplam = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+" + "+arr[j]+"toplamı = "+istenenToplam);
                }

            }

        }
    }


}// Class sonu