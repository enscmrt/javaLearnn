package j11_Arrays.Task02;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr1= str.split(" ");
        int dolarToplam =0;
        int euroToplam =0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].contains("$")){
                dolarToplam += Integer.parseInt(arr1[i].replace("$",""));
            }
            else{
                euroToplam += Integer.parseInt(arr1[i].replace("£",""));
            }

        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);


    }
}
