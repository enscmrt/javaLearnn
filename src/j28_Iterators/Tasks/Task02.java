package j28_Iterators.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {
            /*  task->
        Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz
        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
	    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
	    output: [23,40]
         */
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator<Integer>l1=list.listIterator();
        while (l1.hasNext()){
            l1.next();
            if (l1.next()<20&&l1.next()>40){
                l1.remove();
                System.out.println(l1.next());
            }
        }
    }
}
