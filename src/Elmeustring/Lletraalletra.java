package Elmeustring;

import java.util.Scanner;

public class Lletraalletra {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("STRING");
        String s = input.next();
        System.out.println("STRING:" + s);
        System.out.println(" sencer: " + s);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

            System.out.println("STRING lletra x lletra (al revés)");
            for (int I = s.length()-1;i>=0;i--) {
                System.out.println(s.charAt(i));

            }
        }
    }
}
