package j08_Loops.Loop01_FoorLoop.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */




       for (char c = 'A'; c <= 'F'; c++) {
            for (int i = 0; i <= c - 'A'; i++) {
                if (i == 0) {
                    System.out.print(c + " ");
                } else {
                    System.out.print(c + " ");
                }

            }
           System.out.println();




    }
        /*int harf = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+i)+" ");

            }
            System.out.println();

        }*/


}
}
