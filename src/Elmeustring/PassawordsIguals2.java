package Elmeustring;

import java.util.Scanner;

public class PassawordsIguals2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PASSWORD 1:");
        String p1 = input.next();

        System.out.print("PASSWORD 2:");
        String p2 = input.next();

        Boolean iguals = true;    // mateixa activitat que la de passwords, però aquesta fa que vagi lletra per lletra x mirar si són iguals o no els passwords
        if (p1.length() != p2.length()) {
            iguals = false;


        } else {
            for (int i = 0; i < p1.length(); i++) {
                if (p1.charAt(i) != p2.charAt(i)) {
                    iguals = false;
                }
            }
            System.out.println("Passwords diferents:" + iguals);
        }
    }
}

