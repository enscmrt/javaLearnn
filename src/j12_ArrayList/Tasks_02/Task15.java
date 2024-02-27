package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.List;

public class Task15 {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {

        List<Integer>sayi=new ArrayList<>();
        for (int i = 2; i <100 ; i++) {
            boolean asalMi=true;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if(asalMi){
                sayi.add(i);
            }

        }
        System.out.println(sayi);

    }
}
