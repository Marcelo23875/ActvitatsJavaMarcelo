package recursius;

public class Fibonacci {
    static void main(String[] args) {

System.out.printf("Fibonacci de %d és %d, 7, fibonacci (7)");
}
    public static int fibonacci (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }


    }
    }
