
package ejerbucles;

import java.util.Scanner;
import java.util.Random;



public class NumerosPrimos {

    
    public static void main(String[] args) {

        /**
         -> nº primo: divisible por simismo y por 1
         Dar la opción al usuario de introducir ("N") un nº positivo por teclado o
            que se genere aleatoriamente. Rango 2 y 600_000_000
         Algoritmo de fuerza bruta
         * si el nº N es par (y no es 2), -> no es primo
         * si no
                recorrer todo el rango de impares de 3 hasta N/2
        ej -
        * 2 -> primo
        * 6 -> no es primo
        * 13 -> primo
        * 15 -> no es primo
        
        **/
        
        final int RANGO_MIN = 2;
        final int RANGO_MAX = 600_000_000;
        
        
        Scanner entradaTeclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        
        int opcion;
        int n = 0;
        
        do {
            
            System.out.println("---------------------");
            System.out.println("NUMEROS PRIMOS");
            System.out.println("---------------------");
            System.out.println("1. Introducir número.");
            System.out.println("2. Generar número aleatorio.");
            System.out.println("3. Salir");
            
            System.out.println("Por favor, introduzca una opción.");
            opcion = entradaTeclado.nextInt();
            
            switch (opcion) {
                    
                    case 1:
                        System.out.println("Ha elegido la opción de introducir un número, por favor, introduzca uno.");
                        do {
                        System.out.println("Recuerde: Debe estar comprendido entre 2 y 600_000_000.");
                        n = entradaTeclado.nextInt();
                        } while (!(n>=RANGO_MIN && n<=RANGO_MAX));
                        break;
                        
                    case 2:
                        System.out.println("Ha elegido la opción de generar un número aleatorio.");
                        n = numAleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
                        System.out.println("El número aleatorio escogido ha sido " + n);
                        
                    case 3: 
                        System.out.println("Finalizando programa.");
                        break;
                    
                    default:
                        System.out.println("Introduzca una opción válida.");                
                        break;
            
                            }
            } while (opcion !=3);
        
            
            
            System.out.println("Ahora, comprobaremos si " + n +  " es un Número Primo.");
            
            
            
            
    }
    
}
