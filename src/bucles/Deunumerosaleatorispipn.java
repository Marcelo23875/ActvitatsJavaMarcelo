package bucles;

import java.util.Scanner;

public class Deunumerosaleatorispipn {
    static void main() {
        Scanner input= new Scanner (System.in );
        int numPars=0, numImpars=0;
        int numPos=0, numNeg=0;
        for (int i =0; i<10;i++) {
          System.out.print ("Número" + 1 +":");
            int n= input.nextInt();
            if (n>=0){
                numPos++;
            }
            else {
                numNeg++;

            }
            if (n%2==0) {
                numPars++;
            }
            else {
                numImpars++;
            }
        }

        System.out.println ("Num Positius:"+ numPos);
        System.out.println ("NUm Negatius:"+ numNeg);
        System.out.println ("NUm Pararells:"+ numPars);
        System.out.println ("NUm Imparells:"+ numImpars);
    }

}

