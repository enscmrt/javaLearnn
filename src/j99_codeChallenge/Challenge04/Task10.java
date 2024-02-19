package j99_codeChallenge.Challenge04;

public class Task10 {


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {

        String kelime ="   Java ogrenmek123 Cok guzel@      ";
       kelime= kelime.replaceAll("\\d","")
                .replace("C","c")
                .replace("@","")
                .trim();
        System.out.println(kelime);






    }

}
