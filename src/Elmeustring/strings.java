package Elmeustring;

public class strings {
    static void main(String[] args) {
        String nom= "Marcelo";
        System.out.println (nom);
        int n = nom.length(); // 4
        int posO=nom.indexOf('l'); // 5
        int posDarreraO=nom.lastIndexOf('o');// 4 darrera lletra

        char primera = nom.charAt(0); // 'M'
        char darrera= nom.charAt(nom.length() -1);
        String part1= nom.substring(4); // 'elo' de la lletra 4 al final
        String part2= nom.substring(4,6); // 'el'          de la lletra 4 a la 6
        String junts= nom+"Alumne" ; // "MarceloAlumne"               juntar nom + variable
        String junts2= nom.concat("alumne");// "MarceloAlumne            juntar nom + variable
        String feina= "Alumne";
        String junts3=nom.concat(feina);//"MarceloAlumne     juntar nom + variable
        String nomMaj= nom.toUpperCase();//MARCELO      totes les lletres en majúscules
        String nomMin= nom.toLowerCase(); //marcelo        totes en minúscules
        String nom2 =nom.replace ('o', 'i');
        boolean començatM= nom.startsWith ("M");//true
        boolean començatA= nom.startsWith ("A");//false
        boolean acabaO=nom.endsWith("O"); //True
        boolean acabaL=nom.endsWith("L"); //False
        boolean acabaElo=nom.endsWith("Elo"); //True




    }
}
