package j11_Arrays.Task01;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

       int Arr1[]= {1,2,3,4};
       int Arr2[]= new int[2];
       Arr2[0]=Arr1[0];
       Arr2[1]=Arr1[Arr1.length-1];
        System.out.println("Arrays.toString(Arr2) = " + Arrays.toString(Arr2));


    }
}