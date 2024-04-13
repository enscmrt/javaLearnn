import java.util.*;

public class Q38_SetTask {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {
        ArrayList<Integer>al1=new ArrayList<>(Arrays.asList(1,2,17,231,589));
        Set<Integer>al2=new HashSet<>();
        yontem1(al1,al2);
        Set<Character>al3=new HashSet<>();
        char a='x';
        yontem2(al3,a);


    }

    private static void yontem2(Set<Character> al3, char a) {
        al3.add(a);
        System.out.println("al3 = " + al3);
    }

    private static void yontem1(ArrayList<Integer> al1, Set<Integer> al2) {
        al2.addAll(al1);
        System.out.println("al2 = " + al2);
    }
}




