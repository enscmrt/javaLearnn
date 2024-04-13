import java.util.Arrays;
import java.util.Scanner;

public class Q58_AnagramControl {
    public static void main(String[] args) {
		/*
		    Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java method create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi giriniz");
        String kelime1 = scan.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz");
        String kelime2 = scan.next();
        anagram(kelime1,kelime2);


    }//main sonu

    private static void anagram(String kelime1, String kelime2) {
        if(kelime1.length()!=kelime2.length()){
            System.out.println("Kelimelerin uzunlugu uyuşmuyor");
        }else{
            char[] kelime1Arr = kelime1.toLowerCase().toCharArray();
            char[] kelime2Arr = kelime2.toLowerCase().toCharArray();
            Arrays.sort(kelime1Arr);
            Arrays.sort(kelime2Arr);
            if(Arrays.equals(kelime1Arr,kelime2Arr)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }
        }
    }
}//Class sonu
