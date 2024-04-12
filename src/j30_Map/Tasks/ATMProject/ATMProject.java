package j30_Map.Tasks.ATMProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMProject {
	/*
	 * ATM uygulaması yapınız.
	 * 
	 * 1. Adım : Bankamızdaki müşterilerin musteriNumarasi ve 4 haneli şifresini tutan bir HashMap oluşturalım.
	 * 		     Ve şu müşterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Müşteri No  -- Şifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adım : Bankamızdaki müşterilerin hesaplarındaki para miktarini tutan bir tane HashMap oluşturalım.
	 * 		     Ve şu miktarları müşteri numarasıyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Müşteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adım : Giriş ekranı oluşturalım. Müşteri buradan giriş yapsın.
	 * 			 Kullanıcı adı ve şifre isteyelim, doğru ise giriş yapsın.
	 * 
	 * 4. Adım : Doğru müşteri numarası ve şifre kontrol eden methodlar yazalım.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, doğru müşteri numarasıdır.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki şifre ile uyuşuyorsa doğru şifredir.
	 * 
	 * 5. Adım : Girş yaptıktan sonra karşısına 3 tane seçenek çıksın : 
	 * 			 Bunları da menuGoster() methodu ile yapalım.
	 * 			 1- Para Çek			// 300
	 * 			 2- Para Yükle			// 500 + 100
	 * 			 3- Toplam Paramı Gör	// 200
	 * 			 4- Çıkış Yap	
	 * 
	 * 6. Adım : Çıkış methodu oluşturalım.
	 * 			 Giriş yapan müşteri çıkış yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sıfırlayalım.
	 * 			 Tekrar giriş ekranına yöndendirelim.	
	 * 
	 * 6. Adım : Toplam parami gor methodu oluşturalım. toplamParamiGor()
	 * 			
	 * 7. Adım : 1- Para Çekme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan çekmek istediği tutarı öğrenelim.	
	 * 			 Hesabında yeterli para varsa, para çeksin yoksa uyarı verelim.
	 * 			 Çektiği tutarı, toplam parasından düşelim ve kaydedelim.		
	 *			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 		  
	 * 8. Adım : 1- Para Yükleme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan yüklemek istediği tutarı öğrenelim.	
	 * 			 Yüklediği tutarı, toplam parasına ekleyelim ve gösterelim.
	 * 			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 
	 * */
	//Müşteri No ve Şifreyi tutmak için HashMap oluşturduk.

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		hm1.put(12345678, 1876);
		hm1.put(22222222, 1234);
		hm1.put(98765432, 1453);
		hm1.put(55554444, 2020);

		HashMap<Integer, Float> hm2 = new HashMap<Integer, Float>();
		hm2.put(12345678, 120.0f);
		hm2.put(22222222, 3000.0f);
		hm2.put(98765432, 7000.0f);
		hm2.put(55554444, 50.0f);

		Scanner scanner = new Scanner(System.in);
		System.out.println("BANKAMIZA HOŞGELDİNİZ");
		System.out.println("Kullanıcı müşteri no giriniz");
		int no = scanner.nextInt();
		System.out.println("Şifrenizi giriniz");
		int sifre = scanner.nextInt();

//		if (hm1.containsKey(no) && hm1.get(no) == sifre) {
//            System.out.println("Giriş yaptınız");
//        } else {
//            System.out.println("Şifre yanlış");
//        }
	musteriNumarasiDogruMu(no,hm1);


	}
	private static void toplamParamiGor(){
		int toplamPara=0;

	}

	private static void cikisYap() {
		System.out.println("ÇIKIŞ YAPTINIZ İYİ GÜNLER DİLERİZ:)");
		menuGoster();
	}

	private static void menuGoster() {
		System.out.println("MENU EKRANINA HOŞGELDİNİZ");
		System.out.println("1- Para Çek");

		System.out.println("2- Para Yükle");
		System.out.println("3- Toplam Paramı Gör");
		System.out.println("4- Çıkış Yap");

	}

	private static void sifreDogruMu(int sifre, HashMap<Integer, Integer> hm1) {
		if (hm1.containsValue(sifre)) {
            System.out.println("Şifre doğru");
        } else {
            System.out.println("Şifre yanlış");
        }

	}

	private static void musteriNumarasiDogruMu(int no, HashMap<Integer, Integer> hm1) {

		if (hm1.containsKey(no)) {
            System.out.println("Müşteri numarası doğru");
			menuGoster();
        } else {
            System.out.println("Müşteri numarası yanlış");
        }
	}



}