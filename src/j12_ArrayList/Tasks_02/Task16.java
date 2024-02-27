package j12_ArrayList.Tasks_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task16 {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {
        List<String> calısanlar=new ArrayList<>(Arrays.asList("Ali","Veli","Ahmet"));
        List<String> isverenler=new ArrayList<>(Arrays.asList("Cenk","Fuat","Müslüm"));
        List<String> şirketler=new ArrayList<>(Arrays.asList("Amazon","Google","Testinium"));
        List<List<String>> diziListe=new ArrayList<>();
        diziListe.add(calısanlar);
        diziListe.add(isverenler);
        diziListe.add(şirketler);
        System.out.println(diziListe);



    }
}
