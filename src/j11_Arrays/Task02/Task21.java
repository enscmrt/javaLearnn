package j11_Arrays.Task02;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 7, 4, 4, 3, 2, 1};
        boolean simetriktir = true;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[(arr.length - 1)-i]) {
                simetriktir = false;
                break;
            }else
                simetriktir = true;

        }
        System.out.println("simetriktir = " + simetriktir);


    }
}

