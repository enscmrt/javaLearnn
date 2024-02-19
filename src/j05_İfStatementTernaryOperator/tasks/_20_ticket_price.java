package j05_İfStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Aracın hızı nedir? = ");
        int currentSpeed = scan.nextInt();
        System.out.println("Ehliyetiniz var mı? (true or false giriniz)= ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

        int ceza = 0;


        if(currentSpeed<=54){
            System.out.println("Yola devam ediniz ceza yemediniz");

        } else if (currentSpeed>=55&&currentSpeed<=74) {
            System.out.println(ceza= 100);


        } else if (currentSpeed>=75&&currentSpeed<=84) {
            System.out.println(ceza= 150);

        } else if (currentSpeed>=85&&currentSpeed<=94) {
            System.out.println(ceza= 320);

        } else if (currentSpeed>94){
            System.out.println(ceza= 500);
        }if(isDriverLicenceAvailable==false){
            System.out.println(ceza = (ceza+200));
        }
        System.out.println("Toplam ceza ="+ceza+"$");



    }
}


