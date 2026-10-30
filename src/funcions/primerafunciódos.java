package funcions;

public class primerafunciódos {
    public static void main(String[] args) {
       imprimirNumeros();
        imprimirNumerosFins(5);
        imprimirNumerosDesdeFins(25);


    }
    public static void imprimirNumeros(int n){      //va es public,després l'estatic, en tercer lloc el void que és el tipus de retorn, en penúltim lloc,poses el nom de la classe o la variable i per últim el parèntesi i lesclaus
for (int i=1; i<=10; i++){   //amb el for, després ve el parèntesi i després les claus
System.out.println(i);
    }
}
    public static void imprimirNumerosFins(){


}
}
    public static void imprimirNumerosDesdeFins(String[] args) {
        imprimirNumeros();
        imprimirNumerosFins(5);
        imprimirNumerosDesdeFins(25);


    }
    public static void imprimirNumeros(int n){      //va es public,després l'estatic, en tercer lloc el void que és el tipus de retorn, en penúltim lloc,poses el nom de la classe o la variable i per últim el parèntesi i lesclaus
        for (int i=1; i<=10; i++){   //amb el for, després ve el parèntesi i després les claus
            System.out.println(i);
        }
    }
    public static void imprimirNumerosFins(){


    }

