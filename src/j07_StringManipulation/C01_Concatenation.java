package j07_StringManipulation;

public class C01_Concatenation {
    /*
concat() -> methodu içinde parametre aldığı String variable'ı çaloştığı string sonuna ekler(birleştirir)
Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
 */
    public static void main(String[] args) {
       String qa= "Halit";
        String teamLead= "Abdurrahman";
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));
        System.out.println("qa = " + qa);
        qa=teamLead.concat(qa);
        System.out.println("qa = " + qa);

        /*
        hap bilgi-> Concate methodu parametre olarak string harici bir değer alırsa o değeri stringe çevirip concat yapar.
         */
        System.out.println("teamLead.concat(23) = " + teamLead.concat(23 + ""));
        System.out.println("teamLead.concat(String.valueOf(100)) = " + teamLead.concat(String.valueOf(100)));


    }
}
