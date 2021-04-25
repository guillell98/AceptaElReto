/**
 * Que Lado de la calle es
 * Es el ejercicio 217 de Acepta el reto
 *
 * @author Guillermo 
 * @version 23.11.2016
 */

import java.util.Scanner;

public class QueLado
{   
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba())
        {
        }
    }

    private static boolean casoDePrueba ( ) 
    {
        int num = entrada.nextInt();
        
        if (num == 0) {
            return false;
        }
        if (num % 2 == 0){
            System.out.println("DERECHA");
        }
        else{
            System.out.println("IZQUIERDA");
        }
        return true;
    }
}



