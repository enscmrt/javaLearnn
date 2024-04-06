package j33_Lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C12_FlatMap {
    /*
  Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
  fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
  Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

  Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
  Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
  flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
  ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

*/
    public static void main(String[] args) throws IOException {
        Path erişilrcrkDosya= Path.of("src/j33_Lambda/HalUk");//erişilecek dosyanın yolu kopyalandı
        Stream<String> dosyaAkisi= Files.lines(erişilrcrkDosya);//erişilecek doya dataları satır olarak akışa alındı
        System.out.println("***Task05***");
        //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi
                .map(t->t.split(" "))//akıştaki satır elemanlar " " göre parçalanıp arraye atandı
                .flatMap(Arrays::stream)//boşluka göre parçalanan satırlar tek boyutlu array halinde akışa alındı.
                .distinct()//akıştaki kelimeler unque benzersi hale getirildi
                .forEach(SeedMethods::strYazdir);

        System.out.println("***Task06***");
        //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi
                .map(t->t.split(" "))//akıştaki satır elemanlar " " göre parçalanıp arraye atandı
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(SeedMethods::strYazdir);

        System.out.println("***Task07***");
        //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi\n                .map(t->t.toLowerCase()\n                        .split(\" \"))//akıştaki satır elemanlar \" \" göre parçalanıp arraye atandı\n                .flatMap(Arrays::stream)\n                .filter(t->t.contains(\"basari\"))\n                .count() = " + Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi
                .map(t -> t.toLowerCase()
                        .split(" "))//akıştaki satır elemanlar " " göre parçalanıp arraye atandı
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("basari"))
                .count());

        System.out.println("***Task08***");
        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi\n                .map(t->t.toLowerCase()\n                        .split(\" \"))//akıştaki satır elemanlar \" \" göre parçalanıp arraye atandı\n                .flatMap(Arrays::stream)\n                .filter(t->t.contains(\"a\"))\n                .count() = " + Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi
                .map(t -> t.toLowerCase()
                        .split(" "))//akıştaki satır elemanlar " " göre parçalanıp arraye atandı
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .count());

        System.out.println("***Task09***");
        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi\n                .map(t->t.toLowerCase()\n                        .split(\" \"))//akıştaki satır elemanlar \" \" göre parçalanıp arraye atandı\n                .flatMap(Arrays::stream)\n                .filter(t->t.contains(\"a\"))\n                .count() = " + Files.lines(erişilrcrkDosya)//Haluk dosyasına erişildi
                .map(t -> t.toLowerCase()
                        .split(" "))//akıştaki satır elemanlar " " göre parçalanıp arraye atandı
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .collect(Collectors.toList())
        //.forEach(System.out::println)
                );
        System.out.println("***Task10***");
        //TASK 10 -> HalUk dosyasında kaç farklı harf kullanıldığını
        Files.lines(erişilrcrkDosya)
                .map(t->t.replaceAll("\\W","").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count();

        System.out.println("***Task11***");
        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
        Files.lines(erişilrcrkDosya)
                .map(t->t.replaceAll("[.!,:)\\-]","").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count();
        System.out.println("***Task12***");
        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.
        System.out.println("Files.lines(erişilrcrkDosya)\n                .map(t->t.replaceAll(\"[.!,:)\\\\-]\",\"\").split(\" \"))\n                .flatMap(Arrays::stream)\n                .distinct()\n                .collect(Collectors.toList()) = " + Files.lines(erişilrcrkDosya)
                .map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));


    }
}
