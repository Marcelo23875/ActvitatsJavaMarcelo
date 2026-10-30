package Equacions;

import java.util.Scanner;

        public class mínim {
            static void main() {
                Scanner input = new Scanner(System.in);
                System.out.print("A:");
                int A = input.nextInt();
                System.out.print("B:");
                int B = input.nextInt();
                if (A < B) {
                    System.out.println("El mínim és: " + A);
                } else {
                    System.out.println("El mínim és: " + B);

                }
            }
        }
