package bucles;

import java.util.Scanner;

public class NumeroOperadorCondicional {

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();
        String m = n%2==0? "parell" : "imparell";
        System.out.print(m);
    }
}