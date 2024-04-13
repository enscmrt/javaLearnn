import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q55_ArrayListTask {


    public static void main(String[] args) {
			/* Task->
			create an array list of cars and retrieve all the value using 3 different ways
			3 elemanlı bir araba listi tanımlayıp 3 farklı yontem ile elemanları print eden code create ediniz.
			 */
        ArrayList<String> carList = new ArrayList<String>(Arrays.asList("BMW","OPEL","SKODA"));
        System.out.println(carList);
        for (int i = 0; i < carList.size(); i++) {
            System.out.print(carList.get(i)+" ");

        }
        System.out.println();
        System.out.println("carList.toString() = " + carList.toString());


        /*
         * Create an arrayList of drinks.
         * If any drink has letter 'a' or 'e' replace it with water.
         */


    }
}
