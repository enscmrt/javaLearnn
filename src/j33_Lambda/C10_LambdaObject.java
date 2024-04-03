package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    /*
  TASK :
  fields --> Universite (String)
             bolum (String)
             ogrcSayisi (int)
             notOrt (double)
             olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
   */
    public static void main(String[] args) {
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University>unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
        System.out.println("unv = " + unv);
        System.out.println("***Task01***");
        System.out.println("kontrolNotOrt74Byk(unv) = " + kontrolNotOrt74Byk(unv));
        // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
        System.out.println("***Task02***");
        //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolOgrncSayisi110Byk(unv) = " + kontrolOgrncSayisi110Byk(unv));
        System.out.println("***Task03***");
        //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
        System.out.println("kontrolMath(unv) = " + kontrolMath(unv));
        System.out.println("***Task04***");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        System.out.println("kontrolOgrSayiBk(unv) = " + kontrolOgrSayiBk(unv));
        System.out.println("***Task05***");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...
        System.out.println("printNotOrtTersSiraliİlk3(unv) = " + printNotOrtTersSiraliİlk3(unv));
        System.out.println("***Task06***");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        System.out.println("printOgrSayisiSiraliEnAz2(unv) = " + printOgrSayisiSiraliEnAz2(unv));
        System.out.println("***Task07***");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
        System.out.println("printNotOrt63BykOgrSayisiBykToplam(unv) = " + printNotOrt63BykOgrSayisiBykToplam(unv));
        System.out.println("****Task 08*****");
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
        System.out.println("****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
        System.out.println("****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
        System.out.println("****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
    }

    private static int printNotOrt63BykOgrSayisiBykToplam(List<C10_University> unv) {
        return unv.stream()
                .filter(t->t.getNotOrt()>63)
                .mapToInt(C10_University::getOgrcSayisi)
                .sum();
    }

    private static List<C10_University> printOgrSayisiSiraliEnAz2(List<C10_University> unv) {
        return unv.stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
    }

    private static List<C10_University> printNotOrtTersSiraliİlk3(List<C10_University> unv) {
        return unv.stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    private static List<C10_University> kontrolOgrSayiBk(List<C10_University> unv) {
        return unv.stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed())
                .collect(Collectors.toList());
    }

    private static String kontrolMath(List<C10_University> unv) {
        return unv.stream()
                .anyMatch(t->t.getBolum().contains("Mat"))?
                "En az bir ünüde math bölümü var":
                "Hiç bir ünüde math bölümü yoktur";
    }

    private static String kontrolOgrncSayisi110Byk(List<C10_University> unv) {
        return unv.stream()
                .allMatch(t->t.getOgrcSayisi()>=110)?
                "Universitelerin hepsinin öğrenci sayısı 110 dan büyüktür":
                "Universitelerden en az bir tanesinin öğrenci sayısı 110 dan küçüktür";
    }

    private static String kontrolNotOrt74Byk(List<C10_University> unv) {
        return unv.stream()
                .allMatch(t->t.getNotOrt()>74)?
                "Universitelerin hepsinin not ort 74 ten büyüktür":
                "Universitelerden en az bir tanesinin not ort 74 ten küçüktür";
    }


}
