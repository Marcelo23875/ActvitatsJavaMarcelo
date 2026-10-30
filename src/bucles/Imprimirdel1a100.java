package bucles;

public class Imprimirdel1a100 {
    static void main() {
        //For
        for (int i=1;i<=100;i=i+1){
        System.out.print(i + ",");
    }
    System.out.println();
    //While
    int i=1;
    while(i<=100) {
        System.out.print (i+",");
        i=i+1;
    }
    System.out.println ();
    //Do-while
    int j = 1;
    do {
        System.out.print (j + ",");
        j =j +1;
    }while (j<=100);
    }
}


