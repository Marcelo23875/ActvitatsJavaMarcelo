package recursius;

public class girarparaules {

    static void main() {
        System.out.printf("%s alrevés és %s.", "Hola", girar("hola"));
    }

    public static String girar (String p) {
        if (p.length() == 1) {
            return p;

        }
            else  {
                char primera = p.charAt(0);
                String subparaula = p.substring(1);
                return girar(subparaula) + primera;

            }
        }
    }