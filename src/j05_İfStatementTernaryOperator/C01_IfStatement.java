package j05_İfStatementTernaryOperator;

public class C01_IfStatement {
    /*
if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
 */
    public static void main(String[] args) {
        int semraYas = 16;
        int merveYas = 28;
        if (semraYas==merveYas){
            System.out.println("Yasdas arkadaslar");
            System.out.println("Yoksa siz ikizmisiniz?");

        }
        if (merveYas>=40) System.out.println("Merve hanim yasi 40'tan buyuk");
        //Eger if bloktan sonra tek satırlık işlem varsa {} gerek yok
        if (merveYas+semraYas>=45) System.out.println("Tek satırlık aksiyonlarda süslü parantez kullanılmaz");
        System.out.println("Javacan'lara selam olsun");

        System.out.println("Bu çıktıyı okuyorsan kod çalışıyordur");



    }
}
