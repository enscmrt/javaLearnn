public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output+=arr[i];

        }
        System.out.println(output);

        System.out.println("output.replace(\"Is\",\"IsNOT\") = " + output.replace("Is", "IsNOT"));


    }
}
