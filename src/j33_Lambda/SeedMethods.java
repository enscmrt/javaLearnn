package j33_Lambda;

public class SeedMethods {
    public static void intYazdir(int a) {//seed->tohum meth
        System.out.print(a + " ");//parametredeki meth bir boşluk ile call edildi
    }
    public static void strYazdir(String a) {//seed->tohum meth
        System.out.print(a + " ");//parametredeki meth bir boşluk ile call edildi
    }

    public static boolean ciftMi(int a) {
        return a % 2 == 0;
    }


    public static boolean Kck35ciftMi(int a) {
        return a < 35 && a % 2 == 0;
    }

    public static int kareAl(int a) {
        return a * a;
    }
    public static int minBul(int a,int b) {
        return Math.min(a, b);
    }
    public static boolean tekMi(int a) {
        return a % 2 == 1;
    }

}



