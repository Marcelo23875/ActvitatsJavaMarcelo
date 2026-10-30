package Arrays; //30 d'octubre

public class ExemplesArrays {   //Arrays d'una dimensió
    //Arrays->1r tipus, 2n nom, 3r valor i 4t llargada
    //ex: String [] noms= {"Pere","Maria","Joan"};
    static void main() {
        String[] noms = {"Paco", "Pep", "Jose" };
        int[] edats = {13, 21, 45};
        noms = new String[10];
        edats = new int[9];
        noms[3] = "Joanet";
        edats[2] = 22;
        edats[1] += 2;

        System.out.printf("%s té %d.", noms[1], edats[1]);

        // noms[10]="Joan"; sortirà error perquè la casella 10 no existeix

        //System.out.print(noms); imprmeix una cosa rara/subjecte

        //imprimir ascendentment l'array

        for (int i = 0; i < noms.length; i++) { //estructura length d'una array= variable+ .length

            System.out.println(noms[i] + "\t");
        }
        //noms [22]="Pep";//Array out of bounds
        System.out.println();
        imprimirArray(noms);
        imprimirArray(edats);
        //imprimir descendentment l'array

        for (int i = noms.length - 1; i >= 0; i--) ;
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]:%s%n,iarray[i]");

        }


    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]:%s%n,iarray[i]");
        }
        System.out.println("Suma:" + sumaArray(edats));
        System.out.println("Mitjana:" + mitjanaArray (edats)+;
    }

    public static void imprimirArrayun(String[] array) {}
    public static void imprimirArray (int[] array)[]
    public static int sumaArray(int[] array) {}
    public static float mitjaanaarray (int []array){}

    public static int maximArray (int [] array ){}

    public static boolean totzeros (int[] array){}

}
    public static int sumaArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }
        return total;

    }

    public static float mitjanaArray(int[] array) {
        float total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / (float) array.length;

    }
public static float mitjanaArraydos (int [] array){
    return sumaArray(array)/array.length;

    public static int màximArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }
}


