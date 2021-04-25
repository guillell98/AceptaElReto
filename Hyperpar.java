/**
 * Número HyperPar
 * Es el número 165 de Acepta el reto
 * @author Guillermo López Lozano
 * @version 01.12.2020
 */

import java.util.Scanner;

public class Hyperpar
{
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()){}
    }

    private static boolean casoDePrueba () 
    {
        int valor = entrada.nextInt();
        int numero = valor; 
        String hyperpar = "";

        if (numero < 0) {
            return false;
        }
        else if (numero == 0){
            hyperpar = "SI";
            System.out.println(hyperpar);
        }
        else {
            while (numero > 0) { 
                int cifra = numero % 10; 
                
                if (cifra % 2 == 0){
                    hyperpar = "SI";
                }
                else{
                    hyperpar = "NO";
                    numero = 0;
                }

                numero /= 10; 
            }
            
            System.out.println(hyperpar);
        }
        
        return true;
    }
}

