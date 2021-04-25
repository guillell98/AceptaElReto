import java.util.Scanner;

/**
 * Encadenando Palabras
 * Es el ejercicio 188 de Acepta el Reto
 *
 * @author Guillermo López Lozano
 * @version 01.12.2020
 */
public class PalabrasEncadenadas
{
    static java.util.Scanner entrada;

    public static void main(String args[])
    {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()){}
    }

    private static boolean casoDePrueba()
    {
        if(!entrada.hasNext()){
            return false;
        }

        String aux = entrada.nextLine();
        String[] parts = aux.split(" ");        
        int numPartes = parts.length;
        boolean encadenado = true; 
        int primerContador = 0;
        int segundoContador = 1;              
                
        while (segundoContador < numPartes){
            String primera = parts[primerContador];
            String segunda = parts[segundoContador];
            String n = primera.substring(primera.length()-2,primera.length());
            String p = segunda.substring(0,2);
            
            if (!n.equals(p)){
                encadenado = false;
                break;
            }
            
            primerContador++;
            segundoContador++;
        }
        
        if(encadenado){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
        return true;
    }
}