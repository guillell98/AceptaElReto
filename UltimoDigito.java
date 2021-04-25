/**
 * Úlitmo digito del factorial
 * Es el ejercicio 114 de Acepta el reto
 *
 * @author Guillermo 
 * @version 25.11.2020
 */
public class UltimoDigito
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
    int num = entrada.nextInt();
    int factorial = 0;
    if (num<=4){
        factorial = 1;
        while (num>1)
        {
            factorial = factorial * num;
            num --;
        }
    }
    System.out.println(factorial%10);
    }
}

