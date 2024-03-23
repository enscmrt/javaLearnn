package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        System.out.println("ll1 ilk hali = " + ll1);
        //REMOVE
        System.out.println("ll1.remove() = " + ll1.remove());
        System.out.println("ll1 remove sonrası= " + ll1);
        ll1.remove("Cüger");
        System.out.println("ll1 obj remove sonrası= " + ll1);
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());
        System.out.println("ll1.removeLast() = " + ll1.removeLast());

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);
        System.out.println("ll2 = " + ll2);
        System.out.println("ll1.removeAll(ll2) = " + ll1.removeAll(ll2));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll2.element() = " + ll2.element());
        //LinkedList get()->getFirst()->getLast()
        System.out.println("ll2.get(3) = " + ll2.get(3));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());

        LinkedList<Integer>sayiList=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,54,65));
        System.out.println("sayiList.remove(5) = " + sayiList.remove(5));
        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException


    }
}
