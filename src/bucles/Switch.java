package bucles;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("GRUP:");
        char grup = input.next().charAt(0); // Char entra a l'examen,he sa saber programar els chars

        switch (grup) {
            case'A':System.out.println ("Socials"); break;
            case'B':System.out.println ("Científic"); break;
            case'C':System.out.println ("Tecnològic"); break;
            default:System.out.println ("General");



        }

    }
}
