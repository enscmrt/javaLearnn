import java.util.*;

public class Q37_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rastgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(20) + 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(arr[i]);
        }
        System.out.println("list = " + list);
        System.out.println("set = " + set);


    }
}
