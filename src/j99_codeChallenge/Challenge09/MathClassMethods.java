package j99_codeChallenge.Challenge09;

import java.util.Random;

public class MathClassMethods {
    public static void main(String[] args) {
        int a =-12;
        int b =4;
        int c = 10;
        System.out.println("Math.abs(a)nın mutlak değeri = " + Math.abs(a));
        System.out.println("Math.min(a,b)den küçük olanı = " + Math.min(a, b));
        System.out.println("Math.min(a,b)den küçük olanı = " + Math.max(a, b));
        System.out.println("Math.min(a,b)den küçük olanı = " + Math.max(a, Math.max(b,c)));
        System.out.println("Math.multiplyExact(a,b) = " + Math.multiplyExact(a, b));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        System.out.println("Math.pow(3,4) = " + Math.pow(3, 4));
        System.out.println("Math.round(3.8) = " + Math.round(3.8));
        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1));
        System.out.println("Math.floor(3.9) = " + Math.floor(3.9));

        //Math.random() -> double data type sahip olarak algılar 0.0-0.99 arasında bir sayı return eder

        System.out.println("Math.random() = " + Math.random());
        double rasgeleSayi = Math.random()*100;
        System.out.println("rasgeleSayi = " + rasgeleSayi);

        int max = 20;
        int x = (int) (Math.random()*20);
        System.out.println("x = " + x);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+Math.random());


        }

        //Random Class
        Random rastgele = new Random();
        for (int i = 1; i <=10 ; i++) {
            System.out.print("rastgele.nextInt(100) = " + rastgele.nextInt(100));

        }

    }
}
