package Elmeustring;

import java.util.Scanner;

public class Alrevés {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("STRING:");
        String s = input.next();
        System.out.println("STRING sencer :" + s);
        int n= 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
                n++;
                System.out.println(s.charAt(i));
            }


            }
        System.out.println ("NumsAs:"+n);
        }
    }
