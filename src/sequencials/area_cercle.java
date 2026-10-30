package sequencials;

import java.util.Scanner;

import static java.lang.Math.PI;

public class area_cercle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    //  input R
        int r= input.nextInt();

        // calcul de l'àrea
        double area= PI * r * r;

    // output àrea
    System.out.println("AREA:" + area);
    }
}
