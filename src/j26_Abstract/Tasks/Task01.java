package j26_Abstract.Tasks;

import java.util.Scanner;

abstract class Calculator {
    public abstract int calculate(int a, int b);



}

class Sum extends Calculator {

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}

class Divide extends Calculator {

    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}

class Multiply extends Calculator {

    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}

class Substract extends Calculator {

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}

public class Task01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

    }


}


 /*
     6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main

    Calculator'ı a super class yap.

    super class'ın içinde;
    calculating adında bir abstract method oluturunuz.
            Burada iki tane int parametresi vardır.
             return tipi int'dir.

    Sum class'ın içinde;
            Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
            iki parametreyi topla ve sonucu return et.

    Divide class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi böl ve sonucu return et.

    Multiply class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi çarp ve sonucu return et.

    Substract class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi birbirinden çıkart ve sonucu return et.

    Main class'ın içinde
             scanner object oluşturunuz.
             iki int oluştur ve bu iki int değişkenine scanner ata.

    Sum methodu çağır ve sonucu yazdır.
    Divide methodu çağır ve sonucu yazdır.
    Multiply methodu çağır ve sonucu yazdır.
    Substract methodu çağır ve sonucu yazdır.
     */

