package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task-> verilen yılın ayını numarasına göre kaç gun ektğini print eden code create ediniz.
        Aylar ay =Aylar.MART;//Aylar enum data type da ay variable tanımlandı ve değer ataması yapıldı
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay){
            case OCAK:
                System.out.println("Ocak 31 gündür");
                break;
            case SUBAT:
                System.out.println("Subat 28 gündür");
                break;
            case MART:
                System.out.println("Mart 31 gündür");
                break;
            case NISAN:
                System.out.println("Nisan 30 gündür");
                break;
            case MAYIS:
                System.out.println("Mayıs 31 gündür");
                break;
            case HAZIRAN:
                System.out.println("Haziran 30 gündür");
                break;
            case TEMMUZ:
                System.out.println("Temmuz 31 gündür");
                break;
            case AGUSTOS:
                System.out.println("Ağustos 31 gündür");
                break;
            case EYLUL:
                System.out.println("Eylül 30 gündür");
                break;
            case EKIM:
                System.out.println("Ekim 31 gündür");
                break;
            case KASIM:
                System.out.println("Kasım 30 gündür");
                break;
            case ARALIK:
                System.out.println("Aralık 31 gündür");
                    break;
            default:
        }
        System.out.println("Bu mesaj geldiyse kod sorunsuz çalıştı");

    }
}
