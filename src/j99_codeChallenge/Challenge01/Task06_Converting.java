package j99_codeChallenge.Challenge01;

import java.util.Scanner;

public class Task06_Converting {
    public static void main(String[] args) {
        /*  task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül
         c = (f-32)*5/9
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Fahrenayt değerini giriniz = ");
        double fahrenheit = scanner.nextDouble();
        double celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println("Celsius = " + celsius);

    }
}
