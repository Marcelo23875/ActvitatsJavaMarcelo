package bucles;

import java.util.Scanner;

public class OperadorsCondicionals {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Edat:");
        int edat= input.nextInt();
        String m= (edat>=18? "Major d'edat" :"Menor d'edat"); // string + la lletra = (variable>= "el número que tu vulguis" + ? +"primer missatge"
        System.out.println ("Ets "+ m);

    }
}
