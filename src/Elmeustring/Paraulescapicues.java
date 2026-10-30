package Elmeustring;

import java.util.Scanner;

public class Paraulescapicues {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String:");
        String s = input.next();

        Boolean palindrom = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
            palindrom = false;
            }
        }




        System.out.println ("PALINDROM: "+ palindrom );


    }


}
