package j04_JavaOperators;

public class Task_SwapInterviewQuestions {
    public static void main(String[] args) {
        /*
     TASK :
     Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
     code create edip print ediniz.
     a) 3. bir variable kulanarak
     b) 3. bir variable kullanmadan

   input    : sayi1=20 ve sayi2=34;
output  :  sayi1=34 ve sayi2=20

      */

        int sayi1 = 20;
        int sayi2 = 34;
       // int temp = sayi1;
       // sayi1=sayi2;
        //sayi2=temp;
       // System.out.println("Swap işleminden sonra sayi 1 =" +sayi1+"sayi2 =" +sayi2);

        sayi1+= sayi2;
        sayi2 = sayi1-sayi2;
        sayi1-= sayi2;
        System.out.println("Swap işleminden sonra sayi 1 =" +sayi1+"sayi2 =" +sayi2);

    }
}
