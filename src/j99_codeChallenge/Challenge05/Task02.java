package j99_codeChallenge.Challenge05;

public class Task02 {
    //Interview Question
    // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...

    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.println(i+"nin karakter değeri ="+(char) i);
        }

        System.out.println("***while loop çözümü");
        char c;
        int sayı = 0;
        while (sayı<=255){
            c = (char) sayı;
            System.out.println(sayı+"nin karakter değeri ="+c);
            sayı++;
        }

        System.out.println("*** do while loop çözümü");

        int a =0;

        do {
            c = (char) a;
            System.out.println(a+"nin karakter değeri ="+c);
            a++;

        }while (a<=255);






    }//main sonu

}// class sonu
