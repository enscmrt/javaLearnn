public class Q59_ArrayPair {
	
	
	 /* Task->
	   from a given array find all pairs whose sum is a  given number
	   Bir dizide istenen toplama eşit olan sayı ciftlerini print eden method create ediniz.
	   {4,6,5,-10,8,5,20}===>10
	    */
	
	public static void main(String[] args) {
		int arr []={4,6,5,-10,8,5,20};
		toplamon(arr);



		
	}//main sonu

	private static void toplamon(int[] arr) {
		int toplam = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==toplam){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
	}
}//Class sonu
