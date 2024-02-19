package j99_codeChallenge.Challenge02;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {
        /*
  Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
  Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
 */
        int a = 34;
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a);
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        int b =4;
        System.out.println("b = " + b);
        System.out.println("--b = " + --b);
        System.out.println("b-- = " + b--);
        System.out.println("b = " + b);

        int x = 20;
        int y = 15;
        System.out.println("(++x+y--) = " + (++x + y--));




    }
}
