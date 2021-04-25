
/**
 * Escudos del ejército romano
 * Es el ejercicio 119 de Acepta el Reto
 *
 * @author Guillermo
 * @version 26.11.2020
 */
import java.util.Scanner;
public class Romanos
{
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()){}
    }

    private static boolean casoDePrueba () 
    {
        int p = entrada.nextInt();

        if (p == 0) {
            return false;
        }
        else {

            int filas = 0;
            int auxiliar = p;
            int escudos = 0;
            int escudosTotales = 0;

            while (auxiliar - (filas * filas) != 0){
                int total = filas;
                while ((total + 1) * (total + 1) <= auxiliar){
                    total++;
                }
                auxiliar = auxiliar - ((total) * (total));
                int flancos = (total * 2) + ((total -2) * 2);
                escudos = (flancos * 2) + 4;
                int grupo = ((total) * (total)) - flancos;
                escudosTotales = escudosTotales + escudos + grupo;
            } 

            System.out.println(escudosTotales);
            
            return true;
        }
    }
}