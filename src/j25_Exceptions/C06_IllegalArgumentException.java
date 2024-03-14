package j25_Exceptions;

import java.util.Scanner;

public class C06_IllegalArgumentException {
    public static void main(String[] args) {
        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */

        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
// ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scan.nextInt();
        try {
            if (yas<18){
                throw  new IllegalArgumentException("Bu"+yas+"yasında ehliyet alamazsın");
            }else System.out.println("Yasın tutuyor ehliyet alabilirsin");
            System.out.println("try  sorunsuz calıstı");
        }catch (IllegalArgumentException e){
            System.out.println("e.getMessage() = " + e.getMessage()+(18-yas)+"yas daha buyumen lazım");
            System.out.println("Ne yapıyorsun bu yasta ehliyet mi alınır");
            System.out.println("Try exc fırlattı ama catch onu yakaladı");

        }
        System.out.println("app sorunsuz calıstı");
    }
}
