package bucles;

import java.util.Scanner;

public class Productedenumeros {
    static void main() {
        Scanner input=new Scanner (System.in);
        System.out.print ("A");
        int A = input.nextInt();

        System.out.print ("B");
        int B = input.nextInt();
        int P =0;
        int i=1;
        while(i<=A) {
         P=P+B;
            i=i+1;
     }
        System.out.println ("El prducte és de "+"per"+B+P);
    }
}
