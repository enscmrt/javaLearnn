package j33_Lambda;

import java.util.stream.IntStream;

public class C13_Stream_iterator {
    public static void main(String[] args) {
        System.out.println("***Task01***");
        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.
        System.out.println("Task01 AmeleToplama : "+ameleTopla(10));
        System.out.println("Task01 CincixTopla : "+cincixTopla(10));

        System.out.println("***Task02***");
        //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz
        System.out.println("Task02 çift sayıları topla : "+ciftTopla(10));

        System.out.println("***Task03***");
        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
        System.out.println("ilk x adet cift toplam : "+ilkXciftTopla(10));

        System.out.println("***Task04***");
        //TASK 04 --> Ilk X adet pozitif tek tamsayiyi toplayan programi  create ediniz.
        System.out.println("İlk x adet tek sayı toplamı : "+ilkXTekToplam(10));

        System.out.println("***Task05***");
        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
        print2IlkXKuvveti(10);
        System.out.println("\n****Task 06*****");
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        printSayiIlkXKuvveti(5,3);
        System.out.println("\n****Task 07*****");
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        System.out.println("printSayiFaktöriyel(5) = " + printSayiFaktöriyel(5));
        System.out.println("\n****Task 08*****");
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
        printSayiXKuvvet(3,5);



    }

    private static void printSayiXKuvvet(int istenenSayi, int x) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .skip(x-1)
                .forEach(SeedMethods::intYazdir);
    }

    private static long printSayiFaktöriyel(int x) {
       return IntStream
                .rangeClosed(1,x)
                //.mapToLong(t->t)
               .reduce(1,(a,b)->a*b);
    }

    private static void printSayiIlkXKuvveti(int x,int istenenSayi) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .forEach(SeedMethods::intYazdir);

    }

    private static void print2IlkXKuvveti(int x) {
        IntStream
                .iterate(2,t->t*2)
                .limit(x)
                .forEach(SeedMethods::intYazdir);
    }

    private static int ilkXTekToplam(int x) {
        return IntStream
                .iterate(1,t->t+2)
                .limit(x)
                .sum();
    }

    private static int ilkXciftTopla(int x) {
        return IntStream
                .iterate(2,t->t+2)
                .limit(x)
                .sum();
    }

    private static int ciftTopla(int x) {
        return IntStream
                .rangeClosed(1,x)
                .filter(SeedMethods::ciftMi)
                .sum();
    }

    private static int cincixTopla(int x) {
        return IntStream
                .rangeClosed(1,x)
                .sum();
    }

    private static int ameleTopla(int x) {
        int toplam = 0;
        for (int i = 1; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
}
