package j12_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertToList {
    public static void main(String[] args) {
        //King of Trick -> Array'dan liste cevirme yapıldıgında list kaynagı array oldugu için list array gibi davranır:
//eleman akleme ve silme yapılamaz-> add() remove() method çalışmaz RTE verir.

        String[] ulkeArr= {"Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"};
        List<String> ulkeList = Arrays.asList(ulkeArr);
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));
        System.out.println("ulkeList = " + ulkeList);
        //System.out.println("ulkeList.add(\"Fransa\") = " + ulkeList.add("Fransa"));
        //System.out.println("ulkeList.remove(\"Alamanya\") = " + ulkeList.remove("Alamanya"));


    }
}
