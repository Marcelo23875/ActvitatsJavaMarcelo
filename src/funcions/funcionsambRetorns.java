package funcions;

public class funcionsambRetorns {

    static void main(String[] args) {
        int resultat = sumaDosNumeros(3, 7);
        System.out.println("Suma:" + resultat);
        float preu = afegirIVA(100);
        System.out.println("Preu amb IVA:");
        float preu2 = afegirIVA(100);
        System.out.println("Preu amb IVA:");
    }
    public static int sumaDosNumeros(int a, int b){


        int s = a+b;

        return s ;

        // return a+b també se pot fer i així estalvies una línia de codi i una variable
    }
    public static float afegirIVA (float p){
        float piva= p*1.21f;
        return piva;



    }
    public static float afegirIVA2 (float p, float iva){
        float piva=p*iva/100;
        return piva;
    }
    public static boolean esParell (int n){
        if (n%2==0) {
            return true;
            }
        else {  return false;
        }

    }
    public static String enMajúscules (String s) {
        return s.toUpperCase();


    }
}

