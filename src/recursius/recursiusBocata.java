package recursius;

import static java.lang.Math.random;

public class recursiusBocata {
    static void main(String[] args) {
        String bocata="bocataDeFormatge";
    }
    public static String mossegar (String s){
        int n= (int)(Math.random()*3+1);
        return s.substring(0,n);

    }
    public static boolean esTragable (String s){
        return s.length() ==1;

    }
    public static void tragar (String s){
        System.out.print(s);
        System.out.println("ñam!!");

    }
    public static String llevar (String b,String t){
        return b.replaceFirst(t,"");
    }
    public static void menjar (String bocata){
        if (esTragable(bocata)){
            tragar (bocata);
        }
        else {
            String bocí= mossegar(bocata);
            String resta= llevar (bocata,bocí);
            menjar (bocí);
            menjar (resta);

        }
    }
}


    static void main(String[] args) {
        String bocata="bocataDeFormatge";
    }
    public static String mossegar (String s){
        return s.substring (0,1);

    }
    public static boolean esTragable (String s){
        return s.length() <=4;

    }
    public static void tragar (String s){
        System.out.print(s);
        System.out.println("ñam!!");

    }
    public static String llevar (String b,String t){
        return b.replaceFirst(t,"");
    }
    public static void menjar (String bocata){
        if (esTragable(bocata)){
            tragar (bocata);
        }
        else {
            String bocí= mossegar(bocata);
            String resta= llevar (bocata,bocí);
            menjar (bocí);
            menjar (resta);

        }
    }

