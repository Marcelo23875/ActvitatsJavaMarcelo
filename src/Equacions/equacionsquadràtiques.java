package Equacions;

import java.util.Scanner;

public class equacionsquadràtiques {
    static void main() {
        Scanner input= new Scanner (System.in);
        System.out.print ("A:");
        int A = input.nextInt ();
        System.out.print ("B:");
        int B = input.nextInt ();
        System.out.print ("C:");
        int C = input.nextInt ();

        int d = B*B - 4*A*C;

        if (d<0){
            System.out.println("no té solucions reals");
        }

        else {

            if (d == 0) {
                float x = -B/(2*A);
                System.out.println("Té una solució:" + x);
            } else {
                double x1 = -B+ Math.sqrt(d)/(2*A);
                double x2 = -B- Math.sqrt(d)/(2*A);
                System.out.println("Té dues solucións:\n"+x1+"\n"+x2);

            }
        }
    }
}
