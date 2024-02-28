import java.util.Scanner;

public class Q54_AlphabetCheck {

    public static void main(String[] args) {
        // Task->
        // Check if the character is among a-z or A-Z
        // girilen karakterin a-z or A-Z arasında olmasını kontrol eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char character = scan.next().charAt(0);
        if((character>='A'&&character<='Z')||(character>='a'&&character<='z')){
            System.out.println("Girilen karakter harftir");

        } else
            System.out.println("Girilen karakter harf değildir");

    }
}
