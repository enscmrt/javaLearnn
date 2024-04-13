public class Q63_FactorialWithoutLoop {
    /* task-> girilen tamsayının factoriel değerini loop kullanmadan print code create ediniz.
        0! = 1,     1! = 1,     2! = 2*1,   3! = 3*2*1,     6! = 6*5*4*3*2*1
    */
    public static void main(String[] args) {

        int number = 5; // Faktöriyeli hesaplanacak sayı
        long factorial = calculateFactorial(number);
        System.out.println("Faktöriyel: " + factorial);
    }

    public static long calculateFactorial(int n) {
        // Temel durum: 0 ve 1'in faktöriyeli 1'dir
        if (n == 0 || n == 1) {
            return 1;
        }
        // Özyineleme: n'in faktöriyeli n * (n-1)!
        return (long) n * calculateFactorial(n - 1);



    }//main sonu
}//Class sonu

