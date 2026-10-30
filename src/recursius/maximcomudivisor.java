package recursius;

import java.util.Scanner;

import static recursius.màximdunnumero.Maxim2NumerosFuncio.maxim;

public class maximcomudivisor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A:");
        int a = input.nextInt();
        System.out.print("B:");
        int b = input.nextInt();
        System.out.printf("El MCD de %d i %d és %d.%n", a, b, maxComuDivisor(a, b));
    }
    public static maxComuDivisor (int a,int b)
    public static int minim (int a, int b) {return (a<b)?a:b}
    public static int minim (int a, int b) {return (a>b)?a:b}
    public static int maxComuDivisor (int a,int b){
       int maxAB= maxim (a,b);
       int mínAB=minim(a,b);
       int restaAB=maxAB % mínAB;
       if (restaAB==0){
           return mínAB;
       }
       else {
           return maxComuDivisor(mínAB,restaAB);
       }



    }
}

    public static int maxComuDivisor (int a, int b){
        int m= minim(a,b);
        while (a%m!=0||b%m!=0){
            m--;
        }
        return m;

    }
    public static int minim (int a, int b){
        return (a<b)? a:b;
    }





