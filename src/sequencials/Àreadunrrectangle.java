package sequencials;

import java.util.Scanner;

public class Àreadunrrectangle {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print ("A:");
        int a=input.nextInt();

        System.out.print ("B:");
        int b=input.nextInt();

        System.out.printf("l'àrea del rectangle és %d,", areaRectangle(a,b));


    }

    public static int areaRectangle(int a, int b){

       return a=a*b;

    }
}
