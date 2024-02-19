package j99_codeChallenge.Challenge05;

public class Task09 {

    /*
    Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
     */
    public static void main(String[] args) {

        int toplam =0;
        int count =0;
        for (int i = 11; i <= 120; i++) {
            if (i % 12==0) {
                toplam+=i;
                count++;
            }
        }
        System.out.println(toplam);
        System.out.println(count);



    }

}
