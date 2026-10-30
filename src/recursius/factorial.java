package recursius;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N:");
        int n = input.nextInt();

       System.out.printf("El factorial de %d és %d.", n, factorial (n));
    }

    public static int f(int n) {
        int f = 1;
        while (n > 1) {
            f = f * n;
            System.out.println("F:" + f);
            n = n - 1;
        }
        return f;
    }
    public static int factorialR(int n) {
        if (n == 0) {
            return 1;//Cas base (sabem la solució 0!=1)

        } else {
            return n * factorialR(n - 1); //Cas recursiu
        }
        System.out.printf("El factorial de %d és %d.", n, factorial(n));
        System.out.printf("El factorial recursiu de %d és %d.", n, factorial(n));
    }
}