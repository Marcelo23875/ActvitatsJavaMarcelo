package Variables;

import java.util.Scanner;

public class Variablesdos

{
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Que te diven?");
        String nom= input.next();
        System.out.println("Quant anys tens?");
        int edat = input.nextInt();
        System.out.println("Quant medeixes?");
        float altura= input.nextFloat();
        System.out.println("A quina classe aniràs?");
        char grupClasse=input.next().charAt(0);
        System.out.println("Ets major d'edat?");
        boolean majorEdat= input.nextBoolean();
        System.out.print ("Nom:"+nom+","+edat+"anys"+"\nmedeixo"+altura+"cm"+"\tGroup classe:"+grupClasse +"grupClasse" +
                "\n\nNo som major d'edat: "+majorEdat);



    }
}
