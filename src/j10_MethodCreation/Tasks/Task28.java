package j10_MethodCreation.Tasks;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task28 {
    /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir max sayı giriniz: ");
        int max = Integer.MAX_VALUE;
        System.out.println(randomNum(max));
    }

    private static int randomNum(int max) {
        return (int) (Math.random() * max);
    }
}
