package j07_StringManipulation.Task_02;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz


       String str = "Alamanya";
       int ilka = str.indexOf("a");
       String ilkaSonrası =str.substring(ilka+1);
       int ikincia = ilka+ilkaSonrası.indexOf("a")+1;
        System.out.println("ikincia = " + ikincia);


    }
}
