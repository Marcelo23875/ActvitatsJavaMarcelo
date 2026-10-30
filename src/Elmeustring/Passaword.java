package Elmeustring;

import java.util.Scanner;

public class Passaword {
    static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.print("PASSWORD 1:");
       String p1 = input.next ();

        System.out.print("PASSWORD 2:");
        String p2 = input.next ();

        if (p1.equals (p2)){        // s'ha de posar equals perquè amb el String no funciona els objectes
            System.out.println("Passwords iguals.");

        }
        else {
            System.out.println ("Passaword no iguals.");
        }
    }
}
