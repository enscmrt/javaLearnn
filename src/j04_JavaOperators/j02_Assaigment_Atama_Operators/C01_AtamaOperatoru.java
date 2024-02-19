package j04_JavaOperators.j02_Assaigment_Atama_Operators;

public class C01_AtamaOperatoru {

    //    =         x = 8      x = 8
    //    +=        x += 3     x = x + 3
    //    -=        x -= 3     x = x - 3
    //    *=        x *= 3     x = x * 3
    //    /=        x /= 3     x = x / 3
    //    %=        x %= 3     x = x % 3
    public static void main(String[] args) {
        int saimYas = 48;
        System.out.println("saimYas+5 = " + (saimYas + 5));
        System.out.println("saimYas = " + saimYas);
        System.out.println("saimYas +=11 = " + (saimYas += 11));
        System.out.println("saimYas = " + saimYas);

        System.out.println("saimYas%=5 = " + (saimYas %= 5));
        System.out.println("saimYas = " + saimYas);

    }
}
