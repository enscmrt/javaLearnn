package j12_ArrayList.Tasks_01;

import java.util.ArrayList;
import java.util.List;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {
        List<Integer>arr = new ArrayList<>(List.of(1,2,3,1));
        System.out.println("dupicate(arr) = " + dupicate(arr));
    }

    private static boolean dupicate(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}