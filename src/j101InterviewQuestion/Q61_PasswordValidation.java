import java.util.Scanner;

public class Q61_PasswordValidation {
    /*
     * 1. Password MUST be at least have 6 characters and should not contain space
     * 2. PassWord should at least contain one upper case letter
     * 3. PassWord should at least contain one lower case letter
     * 4. Password should at least contain one special characters
     * 5. Password should at least contain a digit
     */
    public static void main(String[] args) {
        String password="";
        System.out.println("Lütfen şifre giriniz");
        password=new Scanner(System.in).nextLine();
        System.out.println("kontrol(password) = " + kontrol(password));


    }//main sonu

    private static boolean kontrol(String password) {
        if(password.length()<6||password.contains(" ")){
            return false;
        }

        boolean kucukHarf=false;
        boolean buyukHarf=false;
        boolean rakam=false;
        boolean ozelKar=false;

        for (char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                buyukHarf=true;
            }
            if(Character.isLowerCase(c)){
                kucukHarf=true;
            }
            if(Character.isDigit(c)){
                rakam=true;
            }
            if(Character.isLetter(c)){
                ozelKar=true;
            }
        }
        if(kucukHarf&&buyukHarf&&rakam&&ozelKar){
            return true;
        }else{
            return false;
        }
    }
}//Class sonu
