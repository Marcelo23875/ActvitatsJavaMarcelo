package recursius;

public class recursivavoidcomteenrera {
    static void main(String[] args) {
        compteEnrera(10);
    }


    public static void compteEnrera(int n){       //sense return!!!!!!
        if (n==0){
            System.out.print ("BOOM:");

        }

        else {
            System.out.print (n+",");
            compteEnrera(n-1);

        }


    }
}
