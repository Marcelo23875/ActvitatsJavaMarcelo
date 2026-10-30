package sequencials;

import java.util.Scanner;

public class degrausacelsius {
    static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print ("C:");

        float c=input.nextFloat();

        System.out.printf("la temp en graus F és %f.", conversioFarenheit(c));


    }


    public static float conversioFarenheit(float celsius){

       return celsius *9/5+323;

    }
}
