package j08_Loops.Loop02_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */

        int enBuyuk=999;
        int count =0;
        while (enBuyuk>=100){
            if(enBuyuk%4==0&&enBuyuk%6==0){
                System.out.println(enBuyuk+" ");
                count++;
            }
            enBuyuk--;
        }

        System.out.print("\n"+count+"adet 3 basamaklı 4 ve 6 ya tam bölünebilen sayı vardır");



    }

}
