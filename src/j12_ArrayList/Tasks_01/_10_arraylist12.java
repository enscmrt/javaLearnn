package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        List<Integer>common = new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int sayi1=20;
        int sayi2=30;
        System.out.println("rangeBtw(common,sayi1,sayi2) = " + rangeBtw(common, sayi1, sayi2));
    }

    private static int rangeBtw(List<Integer> common, int sayi1, int sayi2) {
        int count=0;
        for (int i = 0; i < common.size(); i++) {
            if (sayi1<=common.get(i) && common.get(i)<=sayi2) {
                count++;
            }
        }
        return count;
    }
}