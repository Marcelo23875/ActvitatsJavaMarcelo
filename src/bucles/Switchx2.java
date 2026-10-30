package bucles;

import java.util.Scanner;

public class Switchx2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nota:");
        int nota = input.nextInt(); //

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:System.out.println ("Suspès"); break;
            case 5:
            case 6:System.out.println("aporvat"); break;
            case 7:
            case 8:System.out.println("notable");break;
            case 9:
            case 10:System.out.println ("Excelent");

            default:System.out.println("nota no acceptada");




        }

    }
}
