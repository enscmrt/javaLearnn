package j10_MethodCreation;

public class C01_MethodCreation {//Class level
    /*
      code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
      main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
      1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
      parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

      str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                            bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                            bana rapor olarak ne getirdigini bilmem lazim (true/false)

      2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

      3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
         de oldugu gibi
         disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
         deklare edilmeli

         method call edildiğinde  Parametre olarak
         declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
  */
    public static void main(String[] args) {
        selam();
        topla();
       // selam();
        //methodlar main icinde call edildiği sıraya göre yukarıdan asagıya ve soldan saga doğru run edilir.
        //topla();
        System.out.println("topla1() = " + topla1());
        //return type olan method sout edilmezse veya bir variable ye atanıp sout edilmezse çıktı vermez ama metod run edilir
        topla2(23,47,61);
        topla2(21,12,25);
        System.out.println("topla3(12,32,41) = " + topla3(12, 32, 41));
    }//main sonu

    private static double topla3(int a, double b, int c) {
        return a+b+c;
    }

    public static void topla2(int hadi, int bakalım, int java) {
        System.out.println("toplam= "+(hadi+bakalım+java));
    }

    private static String topla1() {
        int a = 27;
        int b =55;
        System.out.println("return type meth selamlar");
        return "selam ben topla1 meth'dan javaCan "+(a+b);
    }

    public static void selam(){//parametresiz return type olmayan ->void method create edildi
        System.out.println("agaya selam");

    }
    public static void topla(){
        int a = 53;
        int b = 75;
        int toplam = a+b;
        System.out.println(toplam);
    }



}//class sonu
