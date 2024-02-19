package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 100 arası bir not giriniz");
        int not = input.nextInt();

        int sonuc = 0;

        if (not >= 0 && not < 50) {
            sonuc = 1;
        } else if (not < 60) {
            sonuc = 2;
        } else if (not < 80) {
            sonuc = 3;
        } else {
            sonuc = 4;
        }

        switch (sonuc) {
            case 1:
                System.out.println("Notunuz: D");
                break;
            case 2:
                System.out.println("Notunuz: C");
                break;
            case 3:
                System.out.println("Notunuz: B");
                break;
            case 4:
                System.out.println("Notunuz: A");
                break;
                default:
                    System.out.println("Lütfen gecerli not değeri giriniz");


        }

    }


}
