import java.util.Scanner;

/**
 * Goteras
 * Es el ejercicio 216 de Acepta el Reto
 *
 * @author Guillermo López Lozano
 * @version 30.11.2020
 */
public class Goteras
{
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numVeces = entrada.nextInt();

        for (int i = 1; i <= numVeces; i++) {
            repetirCadena();
        }
    }

    private static void repetirCadena()
    {
        int numero = entrada.nextInt();

        if (numero <= 86400){

            int horas = numero / 3600;
            int minutos = (numero - horas * 3600)/60;
            int segundos = numero - (horas * 3600 + minutos * 60);

            String cadenaHoras = "";
            String cadenaMinutos = "";
            String cadenaSegundos = "";

            if(horas < 10) {
                cadenaHoras = "0" + horas;
            }
            else {
                cadenaHoras = "" + horas;
            }

            if(minutos < 10) {
                cadenaMinutos = "0" + minutos;
            }
            else {
                cadenaMinutos = "" + minutos;
            }

            if(segundos < 10) {
                cadenaSegundos = "0" + segundos;
            }
            else {
                cadenaSegundos = "" + segundos;
            }

            System.out.println(cadenaHoras + ":" + cadenaMinutos + ":" + cadenaSegundos);
        }
    }
}
