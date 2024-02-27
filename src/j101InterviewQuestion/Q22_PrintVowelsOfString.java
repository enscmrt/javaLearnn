import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String bisey = input.nextLine();
        System.out.println("Amele kod");
        for (int i = 0; i <bisey.length() ; i++) {
            if(bisey.charAt(i)=='a'||bisey.charAt(i)=='e'||bisey.charAt(i)=='i'||bisey.charAt(i)=='o'||bisey.charAt(i)=='u'){
                System.out.print(bisey.charAt(i));
            }
        }
        System.out.println();
        System.out.println("cincix kod");
        System.out.println("bisey.replaceAll(\"[^aeıioöuü]\",\"\") = " + bisey.replaceAll("[^aeıioöuü]", ""));

    }

}
