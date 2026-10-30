package Elmeustring;

import java.util.Scanner;

public class Gmails {
    static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print ("EMAIL:");
        String Email= input.next();
        int posAt=Email.indexOf('@');
        int posDot= Email.indexOf('.');
        int llarg=Email.length();
        int nom = posAt;
        int domini= posDot-posAt-1;
        int extensió= llarg-posDot-1;
        char lletra1=Email.charAt (0);



        if (posAt!=-1&&
                posDot !=-1 &&
                nom>=3 &&
                domini>=3 &&
                (extensió==2|| extensió==3)&& Character.isLetter(lletra1)){
            System.out.println ("Email Vàlid.");

        }
        else{
            System.out.println ("Emanil no Vàlid.");
        }
    }
}
