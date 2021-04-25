/**
 * Por el hueco de la Escalera
 * Es el ejercicio 540 de Acepta el reto
 *
 * @author Apah 
 * @version 18.02.2016
 */
public class HuecoEscalera
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
        int pisoVivo = entrada.nextInt();
        int escalonesPiso = entrada.nextInt();
        int numPisosSubidos = entrada.nextInt();
        int escalonesAdicionales = entrada.nextInt();
        
        int escalerasSubidas = 0;
        int escalerasBajadas = 0;
        
        escalerasBajadas = (numPisosSubidos*escalonesPiso)+escalonesAdicionales;
        escalerasSubidas = escalerasBajadas + (pisoVivo*escalonesPiso);
        System.out.println(escalerasBajadas + " " + escalerasSubidas);
    }
}

