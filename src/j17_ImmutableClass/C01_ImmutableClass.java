package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str ="Sema";//ilk değer initial ataması yapılmış str bir variable String tipte oluşturuldu.
        String str2="Sema";//str1 ve str2 aynı değer ile ilk ataması yapıldığı için String pooldan aynı referans ile oluştu.
        String str3=new String("Sema");//ilk değer ataması Sema value ile yapıldı heap memory de unique referans değer create edildi.
        String str4=new String("Sema");//ilk değer ataması Sema value ile yapıldı heap memory de unique referans değer create edildi.

        String str5=str3;
        System.out.println("str==str2 = " + (str == str2));//aynı havuz ref
        System.out.println("str3==str5 = " + (str3 == str5));//aynı havuz ref
        System.out.println("str2==str3 = " + (str2 == str3));//farklı havuz ve obj ref
        System.out.println("str.equals(str2) = " + str.equals(str2));//aynı value
        System.out.println("str3==str4 = " + (str3 == str4));//farklı obj ref
        System.out.println("str3.equals(str4) = " + str3.equals(str4));//aynı variable value
        System.out.println("str==str5 = " + (str == str5));//farklı havuz ref
        System.out.println("str.equals(str5) = " + str.equals(str5));//aynı variable value

    }
}
