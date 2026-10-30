package bucles;

public class Exemplecontinue2 {
    static void main(String[] args) {
        for (float i = 10; i >=-10; i--) {
            if (i==0){
                continue;
            }
            System.out.printf("%d:%f%n", i, 1/i);
        }
    }
}


