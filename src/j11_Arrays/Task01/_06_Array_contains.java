package j11_Arrays.Task01;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String arr[]  = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean varMı = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Apple")){
                varMı = true;
                System.out.println(true);
                break;
            }else
                varMı = false;


        }System.out.println(false);


    }
}
