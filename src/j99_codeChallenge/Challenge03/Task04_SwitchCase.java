package j99_codeChallenge.Challenge03;

import java.util.Scanner;

public class Task04_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gun giriniz: ");
        String gun = scan.nextLine().toLowerCase();


        switch (gun) {
            //default:
            //    System.out.println("Agam bugun tatil sahilde pijama atlet duman altı tavuk kanat :)");
            case "pazartesi":
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenium dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("Agam bugun tatil sahilde pijama atlet duman altı tavuk kanat :)");
        }
        System.out.println("Agam bu satır print edildiyse code cincix dewamke :)");


    }// main sonu

}