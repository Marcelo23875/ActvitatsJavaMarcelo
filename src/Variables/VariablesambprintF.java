package Variables;

public class VariablesambprintF

{
    static void main(String[] args) {
        String nom= "Marcelo",llinatge="Medina";
        int edat = 15;
        float altura= 1.65f;
        char grupClasse= 'B';
        boolean menoredat= true ;

        System.out.printf("Hola!%n Som en %s %s.%nTenc %d anys.%n",nom,llinatge,edat);
        System.out.printf("Medeixo %f metres i som del grupClasse %c.",altura,grupClasse);
        System.out.printf("Som menor d'edat? %b",menoredat);



    }
}
