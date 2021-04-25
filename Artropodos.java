
/**
 * Write a description of class Atrtropodos here.
 * 
 * @author (Guillermo) 
 * @version (25/11/2020)
 */
public class Artropodos
{
    static java.util.Scanner entrada;
   
    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba()
    {
        int insectos = entrada.nextInt();
        int aracnidos = entrada.nextInt();
        int crustaceos = entrada.nextInt();
        int escolopendras = entrada.nextInt();
        int anillos = entrada.nextInt();
        System.out.println(insectos*6+aracnidos*8+crustaceos*10+escolopendras*anillos*2);
        
        
    }
}

