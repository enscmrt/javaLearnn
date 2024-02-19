package j07_StringManipulation;

public class C09_Upper_LowerCase {
    public static void main(String[] args) {
        /*
 toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
  */

        String str = "Madem Geldin dünyaya CAlıs JAVA'ya";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());

    }
}
