
/**
 * Hola Mundo
 * Es el ejercicio 116 de Acepta el reto
 *
 * @author Guillermo López
 * @version 05.11.2020
 */
public class HolaMundo
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
	System.out.println("Hola mundo.");
    }
}
