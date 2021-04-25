import java.util.Scanner;

/**
 * Zapping
 * Es el ejercicio 166 de Acepta el Reto
 *
 * @author Guillermo López Lozano
 * @version 01.12.2020
 */
public class Zapping
{
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()){}
    }

    private static boolean casoDePrueba () 
    {
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        if (a == 0 && b == 0) {
            return false;
        }
        else {
            int mayor = 0;
            int menor = 0;

            if(a > b){
                mayor = a;
                menor = b;
            }else if(a < b){
                mayor = b;
                menor = a;
            }

            int diferencia1 = b - a;

            if (diferencia1 < 0){
                diferencia1 = diferencia1 * (-1);
            }

            int diferencia2 = menor + (99 - mayor);

            if (diferencia2 < 0){
                diferencia2 = diferencia2 * (-1);
            }

            if(diferencia1 < diferencia2){
                System.out.println(diferencia1);
            }else{
                System.out.println(diferencia2);    
            }

            return true;
        }
    }
}