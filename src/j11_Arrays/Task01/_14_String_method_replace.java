package j11_Arrays.Task01;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String str = "Hello World";
        String str1 = "";
        String arr[]= str.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("o")){
                str1 += "K";
            }else{
                str1 += arr[i];
            }
        }
        System.out.println(str1);
       // System.out.println(str.replace('o', 'K'));



    }
}