public class Q35_WrapperClassTask {
 /* Task->
     create a method that accepts an int
     and returns twice of that int
     overload this method with wrapper class: Integer

     int parametreli ve parametrenin 2 katını return eden method create ediniz.
     Bu methodu Wrapper class ile overload ediniz.
      */

    public static void main(String[] args) {
        int x=1;
        System.out.println(x);
        parametre2Katei(x);
        int intValue=5;
        Integer wrappedValue=10;
        int result1=parametre2Katei(intValue);
        System.out.println("result1 = " + result1);
        Integer result2=parametre2Katei((wrappedValue));
        System.out.println("result2 = " + result2);


    }

    private static Integer parametre2Katei(Integer x) {
        return 2*x;
    }
    private static int parametre2Katei(int x) {
        return 2*x;
    }


}//Class sonu

