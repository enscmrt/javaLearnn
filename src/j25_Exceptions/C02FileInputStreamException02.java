package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02FileInputStreamException02 {


        public static void main(String[] args) {

            try {//outer try blok->file erisim exc
                FileInputStream fis = new FileInputStream("src/j25_Exceptions/ebikGabik");
                int k;//erişilen file her bir char ascii değerinin atanacağı boş kutu
                try {//inner try blok ->erişilen file daki data okunamadı
                    while ((k = fis.read()) != -1){
                        System.out.print((char) k);//k int ascii olan file degeri char icin casting yapildi->type donusumu
                    }
                    System.out.println();
                    System.out.println("bu ciktiyi okuyorsan inner try blok sorunsuz run edildi ");
                } catch (IOException e) {//inner catch blok file erişiliyor ama dosya okunamıyorsa bu catch blok çalışır
                    System.out.println("istediğn file ulaşıldı ama dosya okunamadı");
                    System.out.println("ınner catch blok run edildi");
                }
                System.out.println("bu ciktiyi okuyorsan outer try blok sorunsuz run edildi ");
            } catch (FileNotFoundException e) {//outer catch blok file erişemezse bu catch blok çalışacak
                System.out.println("EbikGabik dosyasina erisilemiyor");
                System.out.println("Eger bu mesaji okuyorsan try exc. yakaladi");
            }

            System.out.println("Eğer bu mesajı okuyorsan app sorunsuz calıstı");
    }
}
