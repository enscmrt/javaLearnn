package j07_StringManipulation;

public class C08_Trim {
    public static void main(String[] args) {

        /*
trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

       */
        String str = "    merhaba  hoşgeldiniz   ";
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        System.out.println("str.trim() = " + str.trim());
        System.out.println("str.trim().length() = " + str.trim().length());
        System.out.println("str = " + str);//str atama yapılmadığı için değişme olmadı


    }
}
