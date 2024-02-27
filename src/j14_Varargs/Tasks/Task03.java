package j14_Varargs.Tasks;

public class Task03 {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//
        harfCarpimSayi(sayi1, str1, str2, str3);



    }

    private static void harfCarpimSayi(int sayi1, String ... mtn) {
        int strLength=0;
        for (String each: mtn) {
            if(strLength<each.length()){
                strLength=each.length();
            }
        }
        System.out.println(sayi1*strLength);
    }
}
