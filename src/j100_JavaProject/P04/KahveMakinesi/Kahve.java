package j100_JavaProject.P04.KahveMakinesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static j100_JavaProject.P01.ManavProject.input;

public class Kahve {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";

    String coffeeName;
    String coffeeSize;
    String milk;
    String sugar;
    int price;

    //constructor
    public Kahve(String coffeeName, String coffeeSize, String milk, String sugar, int price) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.milk = milk;
        this.sugar = sugar;
        this.price = price;
    }

    public Kahve() {

    }

    // toString -> obj print with fields
    @Override
    public String toString() {
        return
                "CoffeeName='" + coffeeName + '\'' +
                        ", CoffeeSize='" + coffeeSize + '\'' +
                        ", milk='" + milk + '\'' +
                        ", sugar='" + sugar + '\'' +
                        ", price=" + price;
    }

    // public static void kahveSec(){// -> static meth
    public void kahveSec() {


        System.out.println(BOLD + "JavaCAN Cafe'ye Hoşgeldiniz :-) \n                 Fiyat Menüsü:\n" +
                "\n" +
                BOLD + "                 Küçük        Orta        Büyük   \n" +
                c_RED + "1.Türk kahvesi   30Tl         40Tl          50Tl \n" +
                c_PURPLE + "2.Latte          35Tl         45Tl          55Tl \n" +
                c_GREEN + "3.Espresso       40Tl         50Tl          60Tl \n" +
                "\n" +
                "* İlave Süt 10Tl  ");

        System.out.println(BOLD + "Hangi Kahveyi istersiniz?Lütfen dilediğiniz kahve numarasını seçin :");
        System.out.println(c_RED + " 1.Türk kahvesi\n" +
                c_PURPLE + " 2.Latte\n" +
                c_GREEN + " 3.Espresso");

        int tercih = input.nextInt();
        if (tercih ==1) {//Turk kahvesitercih action kontrol
            System.out.println(kahveListesi.get(tercih-1)+" hazırlanıyor");
            coffeeName=kahveListesi.get(tercih-1);
            price=30;

        } else if ((tercih==2)) {
            System.out.println(kahveListesi.get(tercih-1)+" hazırlanıyor");
            coffeeName=kahveListesi.get(tercih-1);
            price=35;

        } else if ((tercih == 3)) {
            System.out.println(kahveListesi.get(tercih-1)+"hazırlanıyor");
            coffeeName=kahveListesi.get(tercih-1);
            price=40;
        }else {
            System.out.println("Lütfen geçerli bir kahve numarası giriniz");
            kahveSec();
        }
        sutSec();


    }

    public void sutSec(){
        System.out.println(BOLD+"Kahvenize süt eklemek istermisiniz? \n"
        +c_GREEN+"süt tercihiniz evet ise -> E\n"+
                c_RED+"süt tercihiniz Hayır ise -> H\n giriniz : ");
        String sutTercihi=input.next().substring(0,1);
        if(sutTercihi.equalsIgnoreCase("E")){
            System.out.println(BOLD+"Kahvenize Süt ekleniyor");
            milk="Sütlü Kahve";
            price+=10;
        } else if (sutTercihi.equalsIgnoreCase("H")){
            System.out.println(BOLD+"Kahveniz Sütsüz hazırlanıyor");
            milk="Sade Kahve";


        }else {
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz");
            sutSec();
        }
        sekerSec();

    }

    public  void sekerSec(){
        System.out.println(BOLD+"Kahvenize seker eklemek istermisiniz? \n"
        +c_GREEN+"seker tercihiniz evet ise -> E\n"+
                c_RED+"seker tercihiniz Hayır ise -> H\n giriniz : ");
        String sekerTercihi=input.next().substring(0,1);
        if(sekerTercihi.equalsIgnoreCase("E")){
            System.out.println("Kaç şeker alırsınızBOLD");
            int sekerSayisi=input.nextInt();
            System.out.println(BOLD+ "Kahvenize "+sekerSayisi+"tane şeker ekleniyor");
            sugar="Seker Kahve";
        } else if (sekerTercihi.equalsIgnoreCase("H")) {
            System.out.println(BOLD+"Kahveniz Sekersiz hazırlanıyor");
            sugar="Sekersiz kahve";

        }else {
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz");
            sekerSec();
        }
        boyutSec();

    }

    public void boyutSec(){
        System.out.println(BOLD+"Kahvenizi hangi boyda almak istersiniz? \n"
                +c_GREEN+"1.BUYUK  ise -> B\n"+
                c_RED+"2.KUCUK ise -> S\n +" +
                c_PURPLE+"3. ORTA ise -> M\n"+BOLD+"giriniz : ");
        String boyTercihi=input.next().substring(0,1);
        if(boyTercihi.equalsIgnoreCase("B")){
            System.out.println(BOLD+"Kahvenize"+boyTercihi+"Hazırlanıyor");
            coffeeSize="Büyük Boy";
            price+=20;
        } else if (boyTercihi.equalsIgnoreCase("M")){
            System.out.println(BOLD+"Kahvenize"+boyTercihi+"Hazırlanıyor");
            coffeeSize="Orta Boy";
            price+=10;


        } else if (boyTercihi.equalsIgnoreCase("S")){
            System.out.println(BOLD+"Kahvenize"+boyTercihi+"Hazırlanıyor");
            coffeeSize="Küçük Boy";

        } else {
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz");
            boyutSec();
        }
        ucretHesapla();
    }
    public  void ucretHesapla(){
        System.out.println("Kahvenizin toplam ücreti : "+price+"TL hesaplanmıştır");
        int ödeme =input.nextInt();
        System.out.println("girilen tutar : "+ ödeme+"TL");
        if(price>ödeme){
            System.out.println((price-ödeme)+"TL kadar eksik ödeme yaptınız");
            ucretHesapla();
        }else {
            System.out.println("Ödeme için teşekkürler  \npara üstü: "+(ödeme-price));
        }
    }

}



