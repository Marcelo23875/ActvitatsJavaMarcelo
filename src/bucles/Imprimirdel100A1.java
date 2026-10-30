package bucles;

public class Imprimirdel100A1 {
    static void main() {
        //For
        for (int i=100;i<0;i=i-1){
        System.out.print(i + ",");
    }
    System.out.println();
    //While
    int i=100;
    while(i<0) {
        System.out.print (i+",");
        i=i-1;
    }
    System.out.println ();
    //Do-while
    int j = 100;
    do {
        System.out.print (j + ",");
        j =j - 1;
    }while (j<0);
    }
}


