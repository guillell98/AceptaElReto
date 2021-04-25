/**
 * Divisores del factorial
 * Es el número 126 de Acepta el reto
 * @author Guillermo
 * @version 25.11.2016
 */
public class Nochevieja
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
        String tiempoCompleto = entrada.next();
        String [] tiempo = new String[2];
        int horas, minutos, resultado;
        
        if (tiempoCompleto.equals("00:00")) {
            return false;
        }
        else{
            tiempo = tiempoCompleto.split(":");
            horas = Integer.parseInt(tiempo[0]);
            minutos = Integer.parseInt(tiempo[1]);
            resultado = (86400 - ((horas * 60 * 60) + (minutos * 60))) / 60;
            System.out.println(resultado);
        }
        return true;
    }
}

