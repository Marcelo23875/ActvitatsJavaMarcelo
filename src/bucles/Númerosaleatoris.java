package bucles;

import java.util.Scanner;

public class Númerosaleatoris {
    static void main() {
        Scanner input=new Scanner (System.in);
        System.out.print("N:");
        int N= input.nextInt();
        int suma=0;
        for (int i=1; i<=N; i=i+1){
            System.out.print("Num"+i+":");
            int x = input.nextInt();
            suma=suma+x;
            System.out.println("suma total :"+ suma);

    }
}
    }
